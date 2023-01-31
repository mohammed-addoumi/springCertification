package question3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FinancialService {

    private final FinancialDataDao financialDataDao;

    public void testInterface(){
        financialDataDao.getAllFinancialData().forEach(System.out::println);
    }
}
