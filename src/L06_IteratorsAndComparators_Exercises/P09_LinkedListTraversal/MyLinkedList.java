package L06_IteratorsAndComparators_Exercises.P09_LinkedListTraversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<T> implements Iterable<T> {
    private List<T> list;
    
    public MyLinkedList() {
        this.list = new ArrayList<>();
    }
    
    public void add(T element){
        this.list.add(element);
    }
    
    public boolean remove(T element){
        if (!this.list.contains(element)){
            return false;
        }
        this.list.remove(element);
        return true;
    }
    
    public int getSize(){
        return this.list.size();
    }
    
    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }
    
    private final class MyLinkedListIterator implements Iterator<T>{
        int index = 0;
        
        @Override
        public boolean hasNext() {
            return this.index < list.size();
        }
    
        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
