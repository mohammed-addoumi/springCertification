package question24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialService {

    @Autowired
    private FinancialDao financialDao;

    public List<FinancialReport> getAllFinancialReports() {
        return financialDao.getAllFinancialReports();
    }
}