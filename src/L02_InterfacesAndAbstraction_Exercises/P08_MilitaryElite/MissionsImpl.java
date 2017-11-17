package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class MissionsImpl implements Missions {
    private static List<String> missionStates = new ArrayList<String>(2){{
        add("inProgress");
        add("Finished");
    }};
    
    private String codeName;
    private String state;
    
    public MissionsImpl(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }
    
    private void setState(String state) {
        if (!missionStates.contains(state)){
            return; // error
        }
        this.state = state;
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
    public void completeMission() {
        this.setState(missionStates.get(1));
    }
}
