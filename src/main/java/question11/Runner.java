package question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
     //   System.out.println(context.getBean(FinancialService.class));

     //   context.getBean(FinancialService.class);

        System.out.println(context.getBean(FinancialDao.class));
      //  System.out.println(context.getBean(FinancialDao.class));
      //  System.out.println(context.getBean(FinancialDao.class));

    }
}
