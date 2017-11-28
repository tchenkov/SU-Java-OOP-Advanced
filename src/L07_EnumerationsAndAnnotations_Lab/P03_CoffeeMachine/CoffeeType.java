package L07_EnumerationsAndAnnotations_Lab.P03_CoffeeMachine;

public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;
    
    @Override
    public String toString() {
        return super.name().charAt(0) + super.name().substring(1).toLowerCase();
    }
}
