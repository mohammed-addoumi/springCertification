package question17;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FinancialDaoImpl implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReport() {
        return List.of(new FinancialReport(1,"name"));
    }
}
