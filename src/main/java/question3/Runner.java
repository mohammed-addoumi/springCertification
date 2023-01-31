package question3;

public class Runner {

    public static void main(String[] args) {
        FinancialDataDao financialDataDao = new FinancialDataDaoImpl1();
        FinancialDataDaoImpl financialDataDao1 = (FinancialDataDaoImpl) financialDataDao;
        financialDataDao1.test();
        FinancialService financialService = new FinancialService(financialDataDao);
        financialService.testInterface();
    }
}
