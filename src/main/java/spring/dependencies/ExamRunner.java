package spring.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\java_core_general\\src\\main\\java\\spring\\dependencies\\exam-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
