package question9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      //  try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext())
        //recommended way is registerShutdownHook
        context.registerShutdownHook();
        context.register(ConfigClass.class);
        context.refresh();
        FinancialService bean = context.getBean(FinancialService.class);
        bean.show();
       // context.close();
    }
}
