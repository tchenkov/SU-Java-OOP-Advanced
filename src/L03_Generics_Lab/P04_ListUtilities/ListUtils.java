package L03_Generics_Lab.P04_ListUtilities;

import java.util.Comparator;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
//        T min = list.get(0);
//
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).compareTo(min) < 0){
//                min = list.get(i);
//            }
//        }
        
        return (T) list.stream().min(Comparator.naturalOrder()).get();
    }
    
    public static <T extends Comparable> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
//        T max = list.get(0);
//
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).compareTo(max) > 0){
//                max = list.get(i);
//            }
//        }
        
        return list.stream().max(Comparable::compareTo).get();
    }
}
