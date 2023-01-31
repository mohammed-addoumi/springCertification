package question3;

import java.util.List;

public class FinancialDataDaoImpl1 implements FinancialDataDao {
    @Override
    public List<FinancialData> getAllFinancialData() {
        return List.of(new FinancialData(10L,"test"));
    }

    public void test(){};
}
