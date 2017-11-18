package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations;

import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.AddRemoveCollection;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveCollectionImpl<T> implements AddRemoveCollection<T> {
    private List<T> myCollection;
    
    public AddRemoveCollectionImpl() {
        this.myCollection = new ArrayList<>();
    }
    
    @Override
    public int add(T element) {
        this.myCollection.add(0, element);
        return 0;
    }
    
    @Override
    public T remove() {
        return this.myCollection.remove(this.myCollection.size() - 1);
    }
}
