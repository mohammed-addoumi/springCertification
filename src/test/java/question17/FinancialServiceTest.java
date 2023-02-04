package question17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith({MockitoExtension.class})
@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = ConfigClass.class)
@TestPropertySource("classpath:application.properties")
class FinancialServiceTest {

    @Autowired
  //  @InjectMocks
    private FinancialService financialService;

    @MockBean
    FinancialDao financialDao;

    @BeforeEach
    void setUp(){
        when(financialDao.getAllFinancialReport())
                .thenReturn(List.of(new FinancialReport(1,"simo"),new FinancialReport(1,"simo")));
    }

    @Test
    void getAllFinancialReport_should_return_list_with_1_element(){
        List<FinancialReport> listOfFinancialReport = financialService.getListOfFinancialReport();
        assertEquals(listOfFinancialReport.size(),2);
    }

}