package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Repair;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldier;

import java.util.List;

public interface Engineer extends SpecialisedSoldier {
    List<Repair> getRepairs();
}
