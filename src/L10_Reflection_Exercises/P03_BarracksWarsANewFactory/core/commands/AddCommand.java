package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.commands;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Unit;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends BaseCommand {
    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }
    
    @Override
    public String execute() {
        
        try {
            String unitType = super.getData()[0];
            Unit unitToAdd = super.getUnitFactory().createUnit(unitType);
            super.getRepository().addUnit(unitToAdd);
            @SuppressWarnings("UnnecessaryLocalVariable")
            String output = unitType + " added!";
            return output;
        }
        catch (ClassNotFoundException | InstantiationException |
                InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            return null;
        }
        
    }
}
