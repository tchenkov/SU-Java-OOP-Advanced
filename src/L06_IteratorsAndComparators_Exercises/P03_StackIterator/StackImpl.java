package L06_IteratorsAndComparators_Exercises.P03_StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackImpl<T extends Integer> implements Iterable<Integer> , Stack<Integer>{
    private List<Integer> stack;
    
    public StackImpl() {
        this.stack = new ArrayList<>();
    }
    
    @Override
    public void push(List<Integer> element) {
        this.stack.addAll(element);
    }
    
    @Override
    public boolean pop() {
        if (this.iterator().hasNext()){
            this.stack.remove(this.stack.size() - 1);
            return true;
        }
    
        System.out.println("No elements");
        return this.iterator().hasNext();
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new MyStackIterator();
    }
    
    private class MyStackIterator implements Iterator<Integer> {
        private int index = stack.size() - 1;
        
        @Override
        public boolean hasNext() {
            return index >= 0;
        }
    
        @Override
        public Integer next() {
            return stack.get(index--);
        }
    }
}
