package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.WeaponType;

public class Axe extends BaseWeapon {
    
    public Axe(String name) {
        super(name, WeaponType.AXE.getMinDamage(), WeaponType.AXE.getMaxDamage(), WeaponType.AXE.getSocketsCount());
    }
}
