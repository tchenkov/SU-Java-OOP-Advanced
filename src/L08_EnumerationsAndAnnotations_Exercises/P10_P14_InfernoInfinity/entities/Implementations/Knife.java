package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.WeaponType;

public class Knife extends BaseWeapon {
    
    public Knife(String name) {
        super(name, WeaponType.KNIFE.getMinDamage(), WeaponType.KNIFE.getMaxDamage(), WeaponType.KNIFE.getSocketsCount());
    }
}
