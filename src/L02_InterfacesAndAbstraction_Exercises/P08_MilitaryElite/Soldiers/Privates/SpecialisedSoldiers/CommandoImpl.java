package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Mission;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldierImpl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    List<Mission> missions = new LinkedList<>();
    
    public CommandoImpl(String id, String firstName, String lastName, double salary, String corps, List<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }
    
    @Override
    public List<Mission> getMissions() {
        return Collections.unmodifiableList(this.missions);
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        output.append(super.toString()).append(System.lineSeparator());
        output.append("Missions:").append(System.lineSeparator());
        if (this.missions.size() > 0){
            for (Mission mission : this.missions) {
                output.append("  ").append(mission).append(System.lineSeparator());
            }
        }
        return output.toString();
    }
}
