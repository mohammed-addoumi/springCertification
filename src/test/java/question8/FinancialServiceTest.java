package question8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ConfigClass.class})
class FinancialServiceTest {

    @Autowired
    private FinancialService financialService;

    @Test
    void getAllFinanceReports_should_return_list_with_one_element(){
        List<FinanceReport> allFinancialReport = financialService.getAllFinancialReport();
        assertEquals(allFinancialReport.size(),1);
    }

}