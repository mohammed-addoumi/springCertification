package question13;

import jakarta.annotation.PostConstruct;

public class FinancialService {

    public FinancialService(){
        System.out.println("financial service instantiated");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("financial service post construct");
    }

    public void show(){
        System.out.println("financial service");
    }
}
