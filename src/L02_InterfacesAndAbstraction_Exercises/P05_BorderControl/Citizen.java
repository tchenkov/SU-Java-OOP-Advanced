package L02_InterfacesAndAbstraction_Exercises.P05_BorderControl;

public class Citizen implements Subject{
    private String name;
    private int age;
    private String id;
    
    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
}
