package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.annotations.Inject;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories.Repository;

public abstract class BaseCommand implements Executable {
    @Inject
    private String[] params;
    @Inject
    private Repository<Weapon> weaponRepository;
    
    protected BaseCommand() {
    }
    
    public String[] getParams() {
        return this.params;
    }
    
    public Repository<Weapon> getWeaponRepository() {
        return this.weaponRepository;
    }
}
