package question19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialTest {

    @Autowired
    private FinancialService financialService;

    public void show(){
        System.out.println(financialService);
    }


}
