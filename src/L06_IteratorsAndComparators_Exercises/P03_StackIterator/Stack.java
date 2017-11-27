package L06_IteratorsAndComparators_Exercises.P03_StackIterator;

import java.util.List;

public interface Stack<T extends Integer> extends Iterable<Integer> {
    void push(List<Integer> element);
    
    boolean pop();
}
