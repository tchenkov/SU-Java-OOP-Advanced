package L06_IteratorsAndComparators_Exercises.P04_Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake<T extends Integer> implements Iterable<Integer> {
    private List<Integer> integerList;
    
    public Lake(List<Integer> integerList) {
        this.integerList = integerList;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new LakeIterator();
    }
    
    private class LakeIterator implements Iterator<Integer>{
        private int index = 0;
    
        @Override
        public boolean hasNext() {
            return this.index < integerList.size();
        }
    
        @Override
        public Integer next() {
            Integer element = integerList.get(this.index);
            this.index += 2;
            if (!this.hasNext() && this.index % 2 == 0){
                this.index = 1;
            }
            
            return element;
        }
    }
}
