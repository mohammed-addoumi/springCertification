package question10;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FinancialService {

    private FinancialDao financialDao;

    public FinancialService(){
        System.out.println("FinancialService object instantiated");
    }

    public void show(){
        financialDao.getAllFinancialReports().forEach(System.out::println);
    }
}
