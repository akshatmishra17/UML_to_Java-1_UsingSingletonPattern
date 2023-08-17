class PersonProperty {
    private String name;

    private PersonProperty(String name) {
        this.name = name;
    }

    public static PersonProperty createProperty(String name) {
        return new PersonProperty(name);
    }

    public String getName() {
        return name;
    }
}