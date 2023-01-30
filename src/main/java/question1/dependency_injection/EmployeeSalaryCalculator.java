package question1.dependency_injection;

import org.springframework.stereotype.Component;
import question1.no_dependency_injection.Employee;
import question1.no_dependency_injection.EmployeeSalary;

import java.util.List;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("calculate salaries");
        return null;
    }
}
