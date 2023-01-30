package question1.dependency_injection;

import org.springframework.stereotype.Component;
import question1.no_dependency_injection.EmployeeSalary;
import question1.no_dependency_injection.SalaryReport;

import java.util.List;

@Component
public class XlsSalaryReport implements SalaryReport {
    @Override
    public void writeReport(List<EmployeeSalary> employeeSalaryList) {
        System.out.println("xls salary report");
    }
}
