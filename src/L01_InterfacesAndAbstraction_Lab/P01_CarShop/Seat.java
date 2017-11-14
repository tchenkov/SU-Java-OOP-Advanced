package L01_InterfacesAndAbstraction_Lab.P01_CarShop;

public class Seat implements Car {
    private String model;
    private String color;
    private int hp;
    private String countryProduced;
    
    public Seat(String model, String color, Integer hp, String countryProduced) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.countryProduced = countryProduced;
    }
    
    @Override
    public String getModel() {
        return this.model;
    }
    
    @Override
    public String getColor() {
        return this.color;
    }
    
    @Override
    public int getHorsePower() {
        return this.hp;
    }
    
    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires",
                this.model,
                this.countryProduced,
                Car.TIRES
        );
    }
}
