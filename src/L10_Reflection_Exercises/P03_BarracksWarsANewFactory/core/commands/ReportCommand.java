package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.commands;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;

public class ReportCommand extends BaseCommand {
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }
    
    @Override
    public String execute() {
        String output = super.getRepository().getStatistics();
        return output;
    }
}
