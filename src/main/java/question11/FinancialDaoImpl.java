package question11;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FinancialDaoImpl implements FinancialDao {

    public FinancialDaoImpl(){
        System.out.println("financial dao implementation instantiated");
    }

    @Override
    public List<FinancialReport> getAllFinancialReports() {
        return List.of(new FinancialReport(1,"name"));
    }
}
