package L04_Generics_Exercises.P11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line1 = br.readLine().split(" ");
        Threeuple threeuple1 = new Threeuple(line1[0] + " " + line1[1], line1[2], line1[3]);
        String[] line2 = br.readLine().split(" ");
        Threeuple threeuple2 = new Threeuple(line2[0], Integer.parseInt(line2[1]), line2[2].equals("drunk"));
        String[] line3 = br.readLine().split(" ");
        Threeuple threeuple3 = new Threeuple(line3[0], Double.parseDouble(line3[1]), line3[2]);
    
        System.out.println(threeuple1);
        System.out.println(threeuple2);
        System.out.println(threeuple3);
    }
}
