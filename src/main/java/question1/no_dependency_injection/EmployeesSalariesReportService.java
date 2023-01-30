package question1.no_dependency_injection;

import java.util.List;

public class EmployeesSalariesReportService {
    private SalaryReport salaryReport;
    private EmployeeDao employeeDao;
    private EmployeeSalaryCalculator employeeSalaryCalculator;

    public EmployeesSalariesReportService(SalaryReport salaryReport,
                                          EmployeeDao employeeDao,
                                          EmployeeSalaryCalculator employeeSalaryCalculator){
        this.salaryReport = salaryReport;
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
