package question16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("question16");
        FinancialService financialService = context.getBean(FinancialService.class);
        financialService.show();
        FinancialList financialList = context.getBean(FinancialList.class);
        financialList.showList();
        FinancialMap financialMap = context.getBean(FinancialMap.class);
        financialMap.showMap();
    }
}
