package question19;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "question19")
@Configuration
public class ConfigClass {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new BeanFactoryPostProcessorImpl();
    }

    @Bean
    public FinancialService financialService(){
        System.out.println("creating financialService bean");
        return new FinancialService();
    }
}
