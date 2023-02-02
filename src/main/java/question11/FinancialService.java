package question11;

import org.springframework.stereotype.Component;

@Component
public class FinancialService {

    private final FinancialDao financialDao;

    public FinancialService(FinancialDao financialDao){
        System.out.println("financial service instantiation");
        this.financialDao = financialDao;
    }

    public void show(){
        System.out.println("test of lazy and eager");
    }
}
