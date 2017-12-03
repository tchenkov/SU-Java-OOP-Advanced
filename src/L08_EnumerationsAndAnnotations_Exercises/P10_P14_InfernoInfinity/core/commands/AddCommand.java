package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.commands;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.BaseCommand;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.Gem;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.factories.GemFactory;

import java.util.Map;

public class AddCommand extends BaseCommand {
    @Override
    public String execute() {
        Map<String, Weapon> weapons = super.getWeaponRepository().findAll();
        String weaponName = super.getParams()[0];
        if (weapons.containsKey(weaponName)){
            int index = Integer.parseInt(super.getParams()[1]);
            Gem gem = GemFactory.create(super.getParams()[2]);
            weapons.get(weaponName).addGem(index, gem);
        }
        return null;
    }
}
