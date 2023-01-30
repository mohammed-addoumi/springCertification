package question1.dependency_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import question1.no_dependency_injection.EmployeeSalary;
import question1.no_dependency_injection.SalaryReport;

import java.util.List;

@Component
@Primary
public class PdfSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("pdf salary report DI");
    }
}
