package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces;

public interface MyList<T> extends AddRemoveCollection<T> {
    int used();
}
