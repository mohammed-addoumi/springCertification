package question16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinancialService {

    private FinancialDao financialDao;

    public FinancialService(FinancialDao financialDao,String name){
        System.out.println("constructor with string");
    }

    @Autowired
    public FinancialService(@Qualifier("financialDaoImpl") FinancialDao financialDao){
        System.out.println("constructor with financialDao");
        this.financialDao = financialDao;
    }

    public void show(){
        financialDao.getAllFinancialReport().forEach(System.out::println);
    }
}
