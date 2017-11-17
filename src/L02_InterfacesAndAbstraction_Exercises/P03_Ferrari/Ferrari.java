package L02_InterfacesAndAbstraction_Exercises.P03_Ferrari;

public class Ferrari implements Car{
    private String model = "488-Spider";
    private String driver;
    
    public Ferrari(String driver) {
        this.driver = driver;
    }
    
    public String getModel() {
        return model;
    }
    
    @Override
    public String getDriver() {
        return this.driver;
    }
    
    public String useBreacks(){
        return "Brakes!";
    }
    
    public String useGasPedal(){
        return "Zadu6avam sA!";
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s/%s/%s/%s",
                this.getModel(),
                this.useBreacks(),
                this.useGasPedal(),
                this.getDriver()
        );
    }
}
