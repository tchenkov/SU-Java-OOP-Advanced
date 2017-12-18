package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.commands;

import L10_Reflection_Exercises.P01_HarvestingFields.core.Executable;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;

public abstract class BaseCommand implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;
    
    protected BaseCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }
    
    protected String[] getData() {
        return this.data;
    }
    
    protected Repository getRepository() {
        return this.repository;
    }
    
    protected UnitFactory getUnitFactory() {
        return this.unitFactory;
    }
}
