package question5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        FinancialService financialService = context.getBean(FinancialService.class);
        financialService.test();
        context.registerShutdownHook();
    }


}
