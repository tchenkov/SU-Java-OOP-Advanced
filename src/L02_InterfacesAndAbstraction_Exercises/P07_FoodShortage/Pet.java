package L02_InterfacesAndAbstraction_Exercises.P07_FoodShortage;

public class Pet implements Subject {
    private String name;
    private String birthdate;
    
    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}
