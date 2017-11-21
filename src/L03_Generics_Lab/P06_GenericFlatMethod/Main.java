package L03_Generics_Lab.P06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1 , null , 5 , 6 , null);
    
        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.0 , null , 5.3 , 6.21 , null);
        
        List<List<? extends Number>> numbers = new ArrayList<>();
        numbers.add(integers);
        numbers.add(doubles);
        
        List<Number> list = new ArrayList<>();
        ListUtils.flatten(list, numbers);
    
        System.out.println(numbers);
    }
}
