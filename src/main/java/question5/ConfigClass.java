package question5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "question5")
public class ConfigClass {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    FinancialService financialService(){
        return new FinancialService();
    }
}
