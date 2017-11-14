package L01_InterfacesAndAbstraction_Lab.P00_ShapesDrawing;

public class Circle implements Drawable {
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        double radiusIn = this.radius - 0.4;
        double radiusOut = this.radius + 0.4;
    
        for (double i = this.radius; i >= -this.radius; --i) {
            for (double j = -this.radius; j < radiusOut; j+=0.5) {
                double value = i * i + j * j;
                if (value >= radiusIn * radiusIn && value <= radiusOut * radiusOut){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
