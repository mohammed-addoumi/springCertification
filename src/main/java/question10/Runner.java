package question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("question10");
        FinancialService financialService = context.getBean(FinancialService.class);
        financialService.show();

        System.out.println(context.getBean(FinancialService.class));
        System.out.println(context.getBean(FinancialService.class));
        System.out.println(context.getBean(FinancialService.class));

        System.out.println(context.getBean(FinancialDao.class));
        System.out.println(context.getBean(FinancialDao.class));
        System.out.println(context.getBean(FinancialDao.class));
    }
}
