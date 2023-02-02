package question11;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {

    @Bean
    public FinancialService financialService(FinancialDao financialDao){
        return new FinancialService(financialDao);
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public FinancialDao financialDao(){
        return new FinancialDaoImpl();
    }
}
