package L06_IteratorsAndComparators_Exercises.P02_Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable {
    private List<String> list;
    private int index;
    
    public ListyIterator(List<String> list) {
        this.list = list;
        this.index = 0;
    }
    
    public boolean move(){
        if (this.hasNext()){
            index++;
            return true;
        }
        
        return false;
    }
    
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }
    
    public void print(){
        System.out.println(
                this.list.size() > 0 ?
                        list.get(index) :
                        "Invalid Operation!"
        );
    }
    
    public void printAll(){
        for (String s : this.list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    @Override
    public Iterator iterator() {
        return new MyIterator();
    }
    
    private class MyIterator implements Iterator<String>{
        private int iteratorIndex = 0;
        
        @Override
        public boolean hasNext() {
            return this.iteratorIndex < list.size();
        }
    
        @Override
        public String next() {
            return list.get(this.iteratorIndex++);
        }
    }
}
