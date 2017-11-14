package L01_InterfacesAndAbstraction_Lab.P00_ShapesDrawing;

public class Rectangle implements Drawable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        drawLine(this.width, "*", "*");
        for (int i = 1; i < this.height - 1; i++) {
            drawLine(this.width, "*", " ");
        }
        drawLine(this.width, "*", "*");
    }
    
    private void drawLine(int length, String border, String fill) {
        System.out.print(border + " ");
        for (int j = 1; j < length - 1; j++) {
            System.out.print(fill + " ");
        }
        System.out.println(border);
    }
}
