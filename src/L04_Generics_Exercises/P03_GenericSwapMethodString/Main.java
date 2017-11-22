package L04_Generics_Exercises.P03_GenericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int count = Integer.parseInt(br.readLine());
        List<Box> list = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            list.add(new Box(br.readLine()));
        }
        
        int[] indices = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index1 = indices[0];
        int index2 = indices[1];
        
        swapElements(list, index1, index2);
        
        list.forEach(System.out::println);
    }
    
    private static <T> void swapElements(List<T> list, int index1, int index2) {
        T mem = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, mem);
    }
}
