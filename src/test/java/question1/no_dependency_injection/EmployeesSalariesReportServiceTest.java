package question1.no_dependency_injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeesSalariesReportServiceTest {

    @InjectMocks
    EmployeesSalariesReportService service;

    @Mock
    EmployeeDao employeeDao;

    @Mock
    EmployeeSalaryCalculator salaryCalculator;

    @Mock
    PdfSalaryReport pdfSalaryReport;

    @BeforeEach
    void setUp(){
        when(employeeDao.findAll()).thenReturn(List.of(new Employee()));
        when(salaryCalculator.calculateSalaries(anyList())).thenReturn(List.of(new EmployeeSalary()));
        doNothing().when(pdfSalaryReport).writeReport(anyList());
    }


    @Test
    void service_should_return_10(){
        int expected = 10;
        int actual = service.generateReport();
        verify(employeeDao).findAll();
        verify(salaryCalculator).calculateSalaries(anyList());
        verify(pdfSalaryReport).writeReport(anyList());
        assertEquals(expected,actual);
    }

}