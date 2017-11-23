package L04_Generics_Exercises.P09_CustomListIterator;

import java.util.List;

public interface CustomList<T extends Comparable> extends Iterable<T>{
    
    List<T> getList();
    
    void add(T element);
    
    T remove(int index);
    
    boolean contains(T element);
    
    void swap(int index1, int index2);
    
    int countGreaterThan(T element);
    
    T getMax();
    
    T getMin();
}
