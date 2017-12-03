package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.commands;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.BaseCommand;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;

import java.util.Map;

public class CompareCommand extends BaseCommand {
    @Override
    public String execute() {
        Map<String, Weapon> weapons = super.getWeaponRepository().findAll();
        String weapon1Name = super.getParams()[0];
        String weapon2Name = super.getParams()[1];
        if (weapons.containsKey(weapon1Name) && weapons.containsKey(weapon2Name)) {
            Weapon weapon1 = weapons.get(weapon1Name);
            Weapon weapon2 = weapons.get(weapon2Name);
            
            if (weapon1.compareTo(weapon2) < 0) {
                return weapon2.print();
            }
            else {
                return weapon1.print();
            }
        }
        return null;
    }
}
