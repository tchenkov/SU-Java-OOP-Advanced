package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.commands;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.BaseCommand;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;

import java.util.Map;

public class PrintCommand extends BaseCommand {
    @Override
    public String execute() {
        Map<String, Weapon> weapons = super.getWeaponRepository().findAll();
        String weaponName = super.getParams()[0];
        if (weapons.containsKey(weaponName)){
            return weapons.get(weaponName).toString();
        }
        return null;
    }
}
