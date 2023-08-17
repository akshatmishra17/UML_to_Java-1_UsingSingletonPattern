import java.util.ArrayList;
import java.util.List;

class Personnel {
    private String name;
    private List<PersonProperty> properties;

    private Personnel(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public static Personnel createPersonnel(String name) {
        return new Personnel(name);
    }

    public void addProperty(PersonProperty property) {
        properties.add(property);
    }

    public String getName() {
        return name;
    }

    public List<PersonProperty> getProperties() {
        return properties;
    }
}