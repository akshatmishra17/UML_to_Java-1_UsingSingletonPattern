import java.util.ArrayList;
import java.util.List;

class Person {
    private static Person instance;
    private String name;
    private List<Personnel> personnelList;
    private Person(String name) {
        this.name = name;
        this.personnelList = new ArrayList<>();
    }
    public static Person getInstance(String name) {
        if (instance == null) {
            instance = new Person(name);}
        return instance;}
    public void addPersonnel(Personnel personnel) {
        personnelList.add(personnel);}
    public String getName() {
        return name;}
    public List<Personnel> getPersonnelList() {
        return personnelList;
    }
}