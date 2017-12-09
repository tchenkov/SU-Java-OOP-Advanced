package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.commands;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.BaseCommand;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.factories.WeaponFactory;

public class CreateCommand extends BaseCommand {
    @Override
    public String execute() {
        Weapon weapon = null;
        switch (super.getParams()[0]) {
            case "AXE":
                weapon = WeaponFactory.createAxe(super.getParams()[1]); break;
            case "KNIFE":
                weapon = WeaponFactory.createKnife(super.getParams()[1]); break;
            case "SWORD":
                weapon = WeaponFactory.createSword(super.getParams()[1]); break;
            default:
                return null;
        }
        super.getWeaponRepository().add(weapon);
        return null;
    }
}
