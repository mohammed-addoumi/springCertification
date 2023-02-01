package question10;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialDaoImpl implements FinancialDao {

    public FinancialDaoImpl(){
        System.out.println("FinancialDaoImpl object created");
    }
    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(1,"simo"));
    }
}
