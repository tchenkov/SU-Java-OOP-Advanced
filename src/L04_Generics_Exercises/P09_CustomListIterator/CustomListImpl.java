package L04_Generics_Exercises.P09_CustomListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomListImpl<T extends Comparable> implements CustomList<T>, Iterable<T>{
    private List<T> list;
    
    public CustomListImpl() {
        this.list = new ArrayList<>();
    }
    
    public List<T> getList() {
        return list;
    }
    
    @Override
    public void add(T element) {
        this.list.add(element);
    }
    
    @Override
    public T remove(int index) {
        return this.list.remove(index);
    }
    
    @Override
    public boolean contains(T element) {
        return this.list.contains(element);
    }
    
    @Override
    public void swap(int index1, int index2) {
        T mem = this.list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, mem);
    }
    
    @Override
    public int countGreaterThan(T element) {
        int count = 0;
        for (T item : this.list) {
            if (item.compareTo(element) > 0){
                count++;
            }
        }
        
        return count;
    }
    
    @Override
    public T getMax() {
        return this.list.stream().max(Comparable::compareTo).get();
    }
    
    @Override
    public T getMin() {
        return this.list.stream().min(Comparable::compareTo).get();
    }
    
    @Override
    public Iterator iterator() {
        return new CustomListIterator();
    }
    
    private class CustomListIterator implements Iterator{
        private int index;
    
        public CustomListIterator() {
            this.index = 0;
        }
    
        @Override
        public boolean hasNext() {
            return this.index < list.size();
        }
    
        @Override
        public Object next() {
            return list.get(index++);
        }
    }
}
