package spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsInjection {
    private List documentList;
    private Set documentSet;
    private Map documentMap;
    private Properties documentProp;

    public List getDocumentList() {
        System.out.println("List of document: " + documentList);
        return documentList;
    }

    public void setDocumentList(List documentList) {
        this.documentList = documentList;
        System.out.println("Set List of document: " + documentList);
    }

    public Set getDocumentSet() {
        System.out.println("Set of document: " + documentSet);
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        System.out.println("Set Set of document: " + documentSet);
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("Set Map of document: " + documentMap);
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        System.out.println("Set Map of document: " + documentMap);
        this.documentMap = documentMap;
    }

    public Properties getDocumentProp() {
        System.out.println("Set Prop of document: " + documentProp);
        return documentProp;
    }

    public void setDocumentProp(Properties documentProp) {
        System.out.println("Set Prop of document: " + documentProp);
        this.documentProp = documentProp;
    }
}
