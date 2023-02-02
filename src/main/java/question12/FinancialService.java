package question12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class FinancialService {

    @Value("${name}")
    private String name;

    @Value("${argName}")
    private String argName;


    public void show(){
        System.out.println("name : " + name);
        System.out.println("arg name : " + argName);

    }


}
