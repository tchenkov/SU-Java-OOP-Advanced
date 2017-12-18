package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.commands;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;

public class RetireCommand extends BaseCommand {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }
    
    @Override
    public String execute() {
        super.getRepository().removeUnit(super.getData()[0]);
        return null;
    }
}
