package L02_InterfacesAndAbstraction_Exercises.P06_BirthdayCelebrations;

public class Robot implements Subject {
    private String name;
    private String id;
    
    public Robot(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String getBirthdate() {
        return null;
    }
}
