package L04_Generics_Exercises.P06_GenericCountMethodDouble;

import java.util.List;

public class Box<T extends Comparable> implements Comparable<Box> {
    private T value;
    
    public Box(T value) {
        this.value = value;
    }
    
    public static <T extends Comparable> int countGreaterValues(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (element.compareTo(item) < 0) {
                count++;
            }
        }
        
        return count;
    }
    
    @Override
    public int compareTo(Box o) {
        return this.value.compareTo(o.value);
    }
    
    @Override
    public String toString() {
        return this.value.getClass().getName() + ": " + this.value;
    }
}
