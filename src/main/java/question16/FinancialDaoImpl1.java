package question16;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialDaoImpl1 implements FinancialDao, Ordered {
    @Override
    public List<FinancialReport> getAllFinancialReport() {
        return List.of(new FinancialReport(2,"name2"));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
