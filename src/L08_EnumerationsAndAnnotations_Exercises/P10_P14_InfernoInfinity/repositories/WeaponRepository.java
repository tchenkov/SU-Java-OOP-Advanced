package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeaponRepository<T extends Weapon> implements Repository<Weapon> {
    private Map<String, Weapon> weapons;
    
    public WeaponRepository() {
        this.weapons = new HashMap<>();
    }
    
    @Override
    public void add(Weapon weapon){
        this.weapons.putIfAbsent(weapon.getName(), weapon);
    }
    
    @Override
    public Map<String, Weapon> findAll() {
        return Collections.unmodifiableMap(this.weapons);
    }
}
