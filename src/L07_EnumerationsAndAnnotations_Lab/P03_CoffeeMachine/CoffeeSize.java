package L07_EnumerationsAndAnnotations_Lab.P03_CoffeeMachine;

public enum CoffeeSize {
    SMALL(50 , 50), NORMAL(100, 75), DOUBLE(200, 100);
    
    private int volume;
    private int cost;
    
    CoffeeSize(int volume, int cost) {
        this.volume = volume;
        this.cost = cost;
    }
    
    public int getCost() {
        return this.cost;
    }
    
    @Override
    public String toString() {
        return super.name().charAt(0) + super.name().substring(1).toLowerCase();
    }
}
