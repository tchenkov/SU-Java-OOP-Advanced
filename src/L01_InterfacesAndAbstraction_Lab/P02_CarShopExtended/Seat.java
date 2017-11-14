package L01_InterfacesAndAbstraction_Lab.P02_CarShopExtended;

public class Seat implements Sellable {
    private String model;
    private String color;
    private int hp;
    private String countryProduced;
    private double price;
    
    public Seat(String model, String color, Integer hp, String countryProduced, Double price) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.countryProduced = countryProduced;
        this.price = price;
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
    public Double getPrice() {
        return this.price;
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
