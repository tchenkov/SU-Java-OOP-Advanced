package L06_IteratorsAndComparators_Exercises.P01_ListyIterator;

import java.util.List;

public class ListyIterator {
    private List<?> list;
    private int index;
    
    public ListyIterator(List<?> list) {
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
    
   
}
