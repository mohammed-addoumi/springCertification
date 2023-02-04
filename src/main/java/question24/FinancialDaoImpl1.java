package question24;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("impl1")
public class FinancialDaoImpl1 implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(2,"name impl1"));
    }
}
