package L02_InterfacesAndAbstraction_Exercises.P07_FoodShortage;

public class Citizen implements Subject, Buyer {
    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int food = 0;
    
    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
    
    @Override
    public int getFood() {
        return this.food;
    }
    
    @Override
    public void buyFood() {
        this.food += 10;
    }
}
