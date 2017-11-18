package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Private;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.PrivateImpl;

import java.util.Collections;
import java.util.List;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
    List<Private> privates;
    
    public LeutenantGeneralImpl(String id, String firstName, String lastName, double salary, List<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }
    
    @Override
    public List<Private> getPrivatesList() {
        return Collections.unmodifiableList(this.privates);
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        output.append(super.toString()).append(System.lineSeparator());
        output.append("Privates:").append(System.lineSeparator());
        if (this.privates.size() > 0){
            this.privates.sort((pr1, pr2) -> pr2.getId().compareTo(pr1.getId()));
    
            for (Private pr : this.privates) {
                output.append("  ").append(pr).append(System.lineSeparator());
            }
        }
        return output.toString();
    }
}
