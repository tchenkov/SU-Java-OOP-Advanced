package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Mission;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldier;

import java.util.List;

public interface Commando extends SpecialisedSoldier {
    List<Mission> getMissions();
}
