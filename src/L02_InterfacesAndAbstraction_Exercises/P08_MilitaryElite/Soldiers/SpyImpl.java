package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.SoldierImpl;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;
    
    public SpyImpl(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }
    
    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }
}
