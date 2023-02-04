package question17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:application.properties")
public class FinancialService {

    @Value("${test.name}")
    private String nameProp;

    @Autowired
    private FinancialDao financialDao;

    public List<FinancialReport> getListOfFinancialReport(){
        System.out.println("test name : " + nameProp);
        return financialDao.getAllFinancialReport();
    }
}
