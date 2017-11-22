package L04_Generics_Exercises.P06_GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int count = Integer.parseInt(br.readLine());
        List<Box> list = new ArrayList<>();
    
        for (int i = 0; i < count; i++) {
            list.add(new Box(Double.parseDouble(br.readLine())));
        }
    
        Box element = new Box(Double.parseDouble(br.readLine()));
    
        System.out.println(Box.countGreaterValues(list, element));
    }
}
