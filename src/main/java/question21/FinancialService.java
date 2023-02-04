package question21;

public class FinancialService {

    private FinancialDao financialDao;

    public FinancialService(FinancialDao financialDao) {
        this.financialDao = financialDao;
    }

    public void show(){
        financialDao.getAllFinancialReports().stream().forEach(System.out::println);
    }
}
