package question19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        FinancialService financialService = context.getBean(FinancialService.class);
        FinancialTest financialTest = context.getBean(FinancialTest.class);
        System.out.println(financialService);
        financialTest.show();
     /*   Client client = new Client();
        System.out.println(client.show(92,12));*/
    }
}
