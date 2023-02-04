package question17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("question17");
        FinancialService financialService = context.getBean(FinancialService.class);
        List<FinancialReport> listOfFinancialReport = financialService.getListOfFinancialReport();
        System.out.println(listOfFinancialReport.size());


    }
}
