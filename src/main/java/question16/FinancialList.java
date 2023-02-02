package question16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialList {

    @Autowired
    List<FinancialDao> financialDaoList;

    public void showList(){
        financialDaoList.forEach(financialDao -> System.out.println(financialDao.getClass()));
    }

}
