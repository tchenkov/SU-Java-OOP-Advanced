package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.PrivateImpl;

import java.util.ArrayList;
import java.util.List;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private static List<String> corpsList = new ArrayList<String>(2){{
        add("Airforces");
        add("Marines");
    }};
    private String corps;
    
    public SpecialisedSoldierImpl(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }
    
    private void setCorps(String corps) {
        if (!corpsList.contains(corps)){
            return; // error?
        }
        this.corps = corps;
    }
    
    @Override
    public String getCorps() {
        return this.corps;
    }
}
