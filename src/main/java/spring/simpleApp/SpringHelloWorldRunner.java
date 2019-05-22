package spring.simpleApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\java_core_general\\src\\main\\resources\\spring-hello-bean.xml");
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        //springHelloWorld.setHelloMessage();
        springHelloWorld.getHelloMessage();
    }
}
