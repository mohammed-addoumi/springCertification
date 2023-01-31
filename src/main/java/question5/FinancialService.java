package question5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FinancialService implements InitializingBean, DisposableBean {

    public FinancialService(){
        System.out.println("instantiation of Financial Service");
    }

    void test(){
        System.out.println("test de financial service");
    }

    @PostConstruct
    void postConstruct(){
        System.out.println("post construct invocation");
    }

    @PreDestroy
    void preDestroy(){
        System.out.println("pre destroy invocation");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set invocation");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy invocation");
    }

    public void initMethod(){
        System.out.println("init method with bean");
    }

    public void destroyMethod(){
        System.out.println("destroy method with bean");
    }
}
