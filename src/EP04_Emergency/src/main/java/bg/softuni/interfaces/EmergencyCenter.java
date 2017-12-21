package bg.softuni.interfaces;

public interface EmergencyCenter {
    String getName();
    
    int getAmountOfMaximumEmergencies();
    
    void processEmergency(Emergency emergency);
    
    boolean isForRetirement();
    
    int getProcessedEmergenciesCount();
    
    long getProcessedStatistics();
}
