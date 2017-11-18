package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class MissionImpl implements Mission {
    private static final List<String> statesList = new ArrayList<String>(){{
        add("inProgress");
        add("Finished");
    }};
    
    String codeName;
    String state;
    
    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }
    
    private void setState(String state) {
        if (!statesList.contains(state)){
            throw new IllegalArgumentException();
        }
        this.state = state;
    }
    
    @Override
    public void completeMission() {
        this.setState(statesList.get(1));
    }
    
    @Override
    public String getCodeName() {
        return this.codeName;
    }
    
    @Override
    public String getState() {
        return this.state;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Code Name: %s State: %s",
                this.codeName, this.state
        );
    }
}
