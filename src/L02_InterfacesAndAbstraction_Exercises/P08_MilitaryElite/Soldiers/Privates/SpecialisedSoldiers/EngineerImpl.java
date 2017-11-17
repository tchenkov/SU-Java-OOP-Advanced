package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Repair;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldierImpl;

import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;
    
    public EngineerImpl(String id, String firstName, String lastName, double salary, String corps, List<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }
    
    @Override
    public List<Repair> getRepairs() {
        return this.repairs;
    }
}
