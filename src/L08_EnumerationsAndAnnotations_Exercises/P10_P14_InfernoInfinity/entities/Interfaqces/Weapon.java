package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.Gem;

public interface Weapon extends Comparable<Weapon> {
    String getName();
    
    void addGem(int index, Gem gem);
    
    void removeGem(int index);
    
    double getItemLevel();
    
    String print();
}
