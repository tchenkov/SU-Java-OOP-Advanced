package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Private;

import java.util.List;

public interface LeutenantGeneral extends Private {
    List<Private> getPrivatesList();
}
