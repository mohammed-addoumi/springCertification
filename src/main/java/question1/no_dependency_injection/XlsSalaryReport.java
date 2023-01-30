package question1.no_dependency_injection;

import java.util.List;

public class XlsSalaryReport implements SalaryReport {
    @Override
    public void writeReport(List<EmployeeSalary> employeeSalaryList) {
        System.out.println("xls salary report");
    }
}
