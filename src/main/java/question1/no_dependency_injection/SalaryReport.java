package question1.no_dependency_injection;

import java.util.List;

public interface SalaryReport {

    void writeReport(List<EmployeeSalary> employeeSalaryList);
}
