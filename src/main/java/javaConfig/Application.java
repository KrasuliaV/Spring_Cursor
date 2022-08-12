package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("Config");

        Calculator calculator = applicationContext.getBean(Calculator.class);

        System.out.println(calculator.mathComparison(12, 45));
        System.out.println(calculator.mathComparison(122, 45));


    }
}
