package question21;

import java.util.List;

public class FinancialDaoImpl implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(1,"name"));
    }
}
