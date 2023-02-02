package question14;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FinancialService implements InitializingBean, DisposableBean {

    public void show(){
        System.out.println("test show financial service");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("financial service post construct");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("financial service after properties set");
    }

    public void initMethod(){
        System.out.println("init method financial service");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("pre destroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("financial service Disposable bean");
    }

    public void destroyMethod(){
        System.out.println("destroy method financial service");
    }
}
