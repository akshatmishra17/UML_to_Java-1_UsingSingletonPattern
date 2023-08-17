import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance("Alex");
        Personnel personnel1 = Personnel.createPersonnel("Rohan");
        Personnel personnel2 = Personnel.createPersonnel("Rahul");
        Personnel personnel3 = Personnel.createPersonnel("Sachin");
        Personnel personnel4 = Personnel.createPersonnel("Saurav");

        person.addPersonnel(personnel1);
        person.addPersonnel(personnel2);
        person.addPersonnel(personnel3);
        person.addPersonnel(personnel4);

        personnel1.addProperty(PersonProperty.createProperty("Hardworking"));
        personnel2.addProperty(PersonProperty.createProperty("Sincere"));
        personnel3.addProperty(PersonProperty.createProperty("Intelligent"));
        personnel4.addProperty(PersonProperty.createProperty("Active"));

        System.out.println(person.getName() + " has personnel:");
        List<Personnel> personnelList = person.getPersonnelList();
        for (int i = 0; i < personnelList.size(); i++) {
            Personnel personnel = personnelList.get(i);
            System.out.println(personnel.getName());
        }

        System.out.println();
        for (int i = 0; i < personnelList.size(); i++) {
            Personnel personnel = personnelList.get(i);
            System.out.println(personnel.getName() + " has properties:");
            List<PersonProperty> propertyList = personnel.getProperties();
            for (int j = 0; j < propertyList.size(); j++) {
                PersonProperty property = propertyList.get(j);
                System.out.println(property.getName());
            }
            System.out.println();
        }
    }
}
