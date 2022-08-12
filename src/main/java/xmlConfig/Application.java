package xmlConfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");

        Calculator calculator = (Calculator) beanFactory.getBean("calculator");

        System.out.println(calculator.mathComparison(56, 7));
        System.out.println(calculator.mathComparison(34, 67));
    }
}
