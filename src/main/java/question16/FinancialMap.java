package question16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FinancialMap {

    @Autowired
    private Map<String,FinancialDao> financialDaoMap;

    public void showMap(){
        financialDaoMap.forEach((key,value)->{
            System.out.println("key : " + key + " value : " + value);
        });
    }
}
