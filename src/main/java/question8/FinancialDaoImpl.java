package question8;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialDaoImpl implements FinancialDao {
    @Override
    public List<FinanceReport> getAllFinanceReport() {
        return List.of(new FinanceReport(1,"simo"));
    }
}
