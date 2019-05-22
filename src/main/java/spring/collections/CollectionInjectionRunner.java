package spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionInjectionRunner {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\java_core_general\\src\\main\\java\\spring\\collections//collection-injection-config.xml");

        CollectionsInjection collectionsInjection = (CollectionsInjection) context.getBean("collectionInjection");

        collectionsInjection.getDocumentList();
        System.out.println();
        collectionsInjection.getDocumentSet();
        System.out.println();
        collectionsInjection.getDocumentMap();
        System.out.println();
        collectionsInjection.getDocumentProp();
    }
}
