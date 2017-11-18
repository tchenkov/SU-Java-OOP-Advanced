package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces;

public interface AddRemoveCollection<T> extends AddCollection<T>{
    T remove();
}
