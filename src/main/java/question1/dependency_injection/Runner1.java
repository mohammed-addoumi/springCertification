package question1.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner1 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
        EmployeesSalariesReportService service = context.getBean(EmployeesSalariesReportService.class);
        service.generateReport();
    }
}
