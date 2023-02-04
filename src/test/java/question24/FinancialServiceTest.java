package question24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ConfigClass.class)
@ActiveProfiles("impl")
class FinancialServiceTest {

    @Autowired
    private FinancialService financialService;

    @Test
    void getAllFinancialReports_should_return_list_with_1_element(){
        List<FinancialReport> allFinancialReports = financialService.getAllFinancialReports();
        assertEquals(allFinancialReports.size(),1);
    }

}