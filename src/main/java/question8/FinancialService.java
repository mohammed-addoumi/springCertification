package question8;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class FinancialService {

    private final FinancialDao financialDao;

    public void show(){
        financialDao.getAllFinanceReport().forEach(System.out::println);
    }

    public List<FinanceReport> getAllFinancialReport(){
        return financialDao.getAllFinanceReport();
    }
}
