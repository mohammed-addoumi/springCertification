package question16;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialDaoImpl implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReport() {
        return List.of(new FinancialReport(1,"name"));
    }
}
