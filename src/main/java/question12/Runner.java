package question12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("question12");
        FinancialService financialService = context.getBean(FinancialService.class);
        financialService.show();
    }
}
