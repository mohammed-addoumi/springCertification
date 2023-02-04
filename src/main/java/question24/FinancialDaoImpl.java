package question24;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("impl")
public class FinancialDaoImpl implements FinancialDao {
    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(1,"simo"));
    }
}
