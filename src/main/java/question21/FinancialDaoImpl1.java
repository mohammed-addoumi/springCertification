package question21;

import java.util.List;

public class FinancialDaoImpl1 implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(2,"test name "));
    }
}
