package question29;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FinancialService {

    @Value("${test.name:null}")
    private String name;

    @Value("${test.age:0}")
    private int age;

    @Value("${test.list}")
    private List<String> names;

    @Value("simo")
    private String fix;

    @Value("#{10 + 2030}")
    private int sum;

    @Value("#{'simo'.toUpperCase()}")
    private String upperCase;
   // @Value("${test.map}")
   // private Map<String,Object> map;

    public void show(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("fix : " + fix);
        System.out.println("sum : " + sum);
        System.out.println("upperCase : " + upperCase);
        names.forEach(System.out::println);
      //  map.forEach(this::showMap);
    }

    public void showMap(String key,Object value){
        System.out.println("key : " + key + " value : " + value);
    }
}
