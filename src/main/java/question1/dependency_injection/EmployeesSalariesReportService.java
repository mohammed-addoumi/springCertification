package question1.dependency_injection;

import org.springframework.stereotype.Component;
import question1.no_dependency_injection.Employee;
import question1.no_dependency_injection.EmployeeSalary;
import question1.no_dependency_injection.SalaryReport;

import java.util.List;

@Component
public class EmployeesSalariesReportService {
    private SalaryReport salaryReport;
    private EmployeeDao employeeDao;
    private EmployeeSalaryCalculator employeeSalaryCalculator;

    public EmployeesSalariesReportService(SalaryReport SalaryReport,
                                          EmployeeDao employeeDao,
                                          EmployeeSalaryCalculator employeeSalaryCalculator){
        this.salaryReport = SalaryReport;
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
    }

    int generateReport(){
        List<Employee> employees = employeeDao.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);
        salaryReport.writeReport(employeeSalaries);
        return 5 + 5;
    }
}
