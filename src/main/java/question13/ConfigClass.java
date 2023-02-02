package question13;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public static BeanFactoryPostProcessor postProcessor(){
        return new BeanFactoryPostProcessorImpl();
    }

    @Bean
    public FinancialService financialService(){
        return new FinancialService();
    }
}
