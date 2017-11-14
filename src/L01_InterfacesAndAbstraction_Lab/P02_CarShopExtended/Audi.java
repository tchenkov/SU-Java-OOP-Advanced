package L01_InterfacesAndAbstraction_Lab.P02_CarShopExtended;

public class Audi implements Rentable {
    private String model;
    private String color;
    private int hp;
    private String countryProduced;
    private int minRentDays;
    private double pricePerDay;
    
    public Audi(String model, String color, Integer hp, String countryProduced,
                Integer minRentDays, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.countryProduced = countryProduced;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }
    
    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }
    
    @Override
    public String getModel() {
        return this.model;
    }
    
    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
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
