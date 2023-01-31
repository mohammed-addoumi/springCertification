package question3;

import java.util.List;

public class FinancialDataDaoImpl implements FinancialDataDao {
    @Override
    public List<FinancialData> getAllFinancialData() {
        return List.of(new FinancialData(12l,"name1"));
    }

    public void test(){};
}
