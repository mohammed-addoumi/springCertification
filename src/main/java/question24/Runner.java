package question24;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
       // ConfigurableEnvironment environment = context.getEnvironment();
      //  environment.setActiveProfiles("impl1");
      //  context.scan("question24");
      //  context.refresh();
        FinancialService financialService = context.getBean(FinancialService.class);
        financialService.getAllFinancialReports();
    }
}
