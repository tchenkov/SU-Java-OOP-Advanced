package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.PrivateImpl;

import java.util.ArrayList;
import java.util.List;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private static final List<String> corpsList = new ArrayList<String>(){{
        add("Airforces");
        add("Marines");
    }};
    
    private String corps = null;
    
    public SpecialisedSoldierImpl(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }
    
    private void setCorps(String corps) {
        if (!corpsList.contains(corps)){
            throw new IllegalArgumentException();
        }
        this.corps = corps;
    }
    
    @Override
    public String getCorps() {
        return this.corps;
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        output.append(super.toString()).append(System.lineSeparator());
        output.append("Corps: ").append(this.corps);
        
        return output.toString();
    }
}
