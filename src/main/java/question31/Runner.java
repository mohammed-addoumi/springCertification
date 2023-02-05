package question31;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        context.register(ConfigClass.class);
        environment.setActiveProfiles("impl","impl1","impl2");
        context.refresh();
        Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);
        String name = environment.getProperty("test.name");
        String option = environment.getProperty("vm.test");
        System.out.println("name = " + name);
        System.out.println("vm option = " + option);
    }
}
