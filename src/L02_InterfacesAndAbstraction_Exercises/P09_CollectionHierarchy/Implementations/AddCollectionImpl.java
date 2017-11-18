package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations;


import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.AddCollection;

import java.util.ArrayList;
import java.util.List;

public class AddCollectionImpl<T> implements AddCollection<T> {
    private List<T> myCollection;
    
    public AddCollectionImpl() {
        this.myCollection = new ArrayList<>();
    }
    
    @Override
    public int add(T element) {
        this.myCollection.add(element);
        return this.myCollection.size() - 1;
    }
}
