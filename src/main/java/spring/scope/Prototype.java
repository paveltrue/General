package spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Prototype {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\java_core_general\\src\\main\\java\\spring\\scope\\bean.xml");
        Message message = (Message) context.getBean("prototype");
        message.setMessage("This is first object");
        message.getMessage();

        Message oneMoreMessage = (Message) context.getBean("prototype");
        oneMoreMessage.getMessage();
    }
}
