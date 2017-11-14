package L01_InterfacesAndAbstraction_Lab.P02_CarShopExtended;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
