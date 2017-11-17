package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Missions;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldierImpl;

import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Missions> missions;
    
    public CommandoImpl(String id, String firstName, String lastName, double salary, String corps, List<Missions> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }
    
    @Override
    public List<Missions> getMissions() {
        return this.missions;
    }
}
