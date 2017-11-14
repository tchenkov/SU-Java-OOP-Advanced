package L01_InterfacesAndAbstraction_Lab.P00_ShapesDrawing;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            queue.add(Integer.parseInt(scan.nextLine()));
        }
        
        Drawable circle = new Circle(queue.poll());
        Drawable rect = new Rectangle(queue.poll(), queue.poll());
        
        circle.draw();
        rect.draw();
    }
}
