package question1.no_dependency_injection;

public class Runner {

    public static void main(String[] args) {
        SalaryReport salaryReport = new XlsSalaryReport();
        EmployeeDao employeeDao = new EmployeeDao();
        EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
        EmployeesSalariesReportService service = new EmployeesSalariesReportService(salaryReport,
                                                                                    employeeDao,
                                                                                    employeeSalaryCalculator);
        service.generateReport();
    }
}
