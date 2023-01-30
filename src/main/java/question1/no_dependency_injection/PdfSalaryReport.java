package question1.no_dependency_injection;

import java.util.List;

public class PdfSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("pdf salary report");
    }
}
