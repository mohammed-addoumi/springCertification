package question10;

//@Configuration
public class ConfigClass {

    //@Bean
    public FinancialService financialService(FinancialDao financialDao){
        return new FinancialService(financialDao);
      //  return new FinancialService(financialDao);
    }

   //@Bean
    public FinancialDao financialDao(){
        return new FinancialDaoImpl();
    }
}
