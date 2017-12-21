package bg.softuni.models;

import bg.softuni.interfaces.Emergency;
import bg.softuni.interfaces.EmergencyCenter;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseEmergencyCenter implements EmergencyCenter {
    private String name;
    private int amountOfMaximumEmergencies;
    private List<Emergency> emergencies;
    boolean isRetired;
    
    protected BaseEmergencyCenter(String name, int amountOfMaximumEmergencies) {
        this.setName(name);
        this.setAmountOfMaximumEmergencies(amountOfMaximumEmergencies);
        this.emergencies = new ArrayList<>();
        this.setRetired(this.amountOfMaximumEmergencies);
    }
    
    private void setRetired(int amountOfMaximumEmergencies) {
        this.isRetired = amountOfMaximumEmergencies == 0;
    }
    
    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAmountOfMaximumEmergencies() {
        return amountOfMaximumEmergencies;
    }

    private void setAmountOfMaximumEmergencies(Integer amountOfMaximumEmergencies) {
        this.amountOfMaximumEmergencies = amountOfMaximumEmergencies;
    }
    
    @Override
    public void processEmergency(Emergency emergency){
        this.emergencies.add(emergency);
        if (this.emergencies.size() == this.amountOfMaximumEmergencies){
            this.isRetired = true;
        }
    }
    
    @Override
    public boolean isForRetirement() {
        return this.isRetired;
    }
    
    @Override
    public int getProcessedEmergenciesCount(){
        return this.emergencies.size();
    }
    
    protected List<Emergency> getEmergencies() {
        return this.emergencies;
    }
}
