package question21;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public FinancialService financialService(FinancialDao financialDaoBean){
        return new FinancialService(financialDaoBean);
    }

    @Bean(autowireCandidate = false)
    public FinancialDao financialDao(){
        return new FinancialDaoImpl();
    }

    @Bean
    public FinancialDao financialDao1(){
        return new FinancialDaoImpl1();
    }
}
