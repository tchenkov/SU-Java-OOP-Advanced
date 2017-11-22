package L04_Generics_Exercises.P02_GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
    
        for (int i = 0; i < count; i++) {
            Box box = new Box(Integer.parseInt(br.readLine()));
            System.out.println(box);
        }
    }
}
