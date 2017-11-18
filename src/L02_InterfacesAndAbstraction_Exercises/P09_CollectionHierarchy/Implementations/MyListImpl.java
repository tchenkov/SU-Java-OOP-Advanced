package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations;

import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyListImpl<T> implements MyList<T> {
    private List<T> myCollection;
    
    public MyListImpl() {
        this.myCollection = new ArrayList<>();
    }
    
    @Override
    public int used() {
        return this.myCollection.size();
    }
    
    @Override
    public T remove() {
        return this.myCollection.remove(0);
    }
    
    @Override
    public int add(T element) {
        this.myCollection.add(0, element);
        return 0;
    }
}
