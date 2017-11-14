package L01_InterfacesAndAbstraction_Lab.P01_CarShop;

public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");
                
                System.out.println(String.format(
                        "%s is %s and have %s horse power",
                        seat.getModel(),
                        seat.getColor(),
                        seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
