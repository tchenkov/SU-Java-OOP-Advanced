package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Private;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.PrivateImpl;

import java.util.List;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
    private List<Private> privates;
    
    public LeutenantGeneralImpl(String id, String firstName, String lastName, double salary, List<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }
    
    @Override
    public List<Private> getPrivates() {
        return this.privates;
    }
}
