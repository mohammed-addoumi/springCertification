package question14;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public static BeanPostProcessor beanPostProcessor(){
        return new BeanPostProcessorImpl();
    }

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public FinancialService financialService(){
        return new FinancialService();
    }
}
