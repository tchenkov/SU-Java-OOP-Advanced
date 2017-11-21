package L03_Generics_Lab.P07_GenericAddAllMethod;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        return (T) list.stream().min(Comparator.naturalOrder()).get();
    }
    
    public static <T extends Comparable> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        return list.stream().max(Comparable::compareTo).get();
    }
    
    public static <T> List<Integer> getNullIndices(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        List<Integer> nullIndices = new LinkedList<>();
    
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                nullIndices.add(i);
            }
        }
        
        return nullIndices;
    }
    
    public static <T> void flatten(List<T> result, List<List<? extends T>> input){
        for (List<? extends T> list : input) {
            result.addAll(list);
        }
    }
    
    public static <T> void addAll(List<T> result, List<? extends T> input){
       result.addAll(input);
    }
}
