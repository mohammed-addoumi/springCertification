package question1.dependency_injection;

import org.springframework.stereotype.Component;
import question1.no_dependency_injection.Employee;

import java.util.List;

@Component
public class EmployeeDao {
    public List<Employee> findAll() {
        System.out.println("find all");
        return null;
    }
}
