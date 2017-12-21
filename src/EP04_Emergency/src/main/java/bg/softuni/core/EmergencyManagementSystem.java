package bg.softuni.core;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.factories.TimeFactory;
import bg.softuni.interfaces.Emergency;
import bg.softuni.interfaces.EmergencyCenter;
import bg.softuni.models.emergency_centers.FiremanServiceCenter;
import bg.softuni.models.emergency_centers.MedicalServiceCenter;
import bg.softuni.models.emergency_centers.PoliceServiceCenter;
import bg.softuni.models.emergensies.HealthEmergency;
import bg.softuni.models.emergensies.OrderEmergency;
import bg.softuni.models.emergensies.PropertyEmergency;

import java.util.*;

public class EmergencyManagementSystem {
    
    private static final String PROPERTY_KEY = "Property";
    private static final String HEALTH_KEY = "Health";
    private static final String ORDER_KEY = "Order";
    private static final String FIRE_KEY = "Fire";
    private static final String MEDICAL_KEY = "Medical";
    private static final String POLICE_KEY = "Police";
    private Map<String, Queue<Emergency>> emergencyMap = new LinkedHashMap<>();
    private Map<String, Queue<EmergencyCenter>> emergencyCenterMap = new LinkedHashMap<>();
    private long amountOfAllProcessedEmergencies = 0;
    private long totalPropertyDamageOfProcessedEmergencies = 0;
    private long savedCasualtiesOfProcessedEmergencies = 0;
    private long specialCasesProcessedCount = 0;
    
    public EmergencyManagementSystem() {
    
    }
    
    public String registerPropertyEmergency(List<String> input) {
        Emergency emergency = new PropertyEmergency(
                input.get(0),
                EmergencyLevel.valueOf(input.get(1)),
                TimeFactory.create(input.get(2)),
                Integer.parseInt(input.get(3))
        );
        emergencyMap.putIfAbsent(PROPERTY_KEY, new ArrayDeque<>());
        Queue<Emergency> emergencyList = emergencyMap.get(PROPERTY_KEY);
        emergencyList.offer(emergency);
        
        return emergency.toString();
    }
    
    public String registerHealthEmergency(List<String> input) {
        Emergency emergency = new HealthEmergency(
                input.get(0),
                EmergencyLevel.valueOf(input.get(1)),
                TimeFactory.create(input.get(2)),
                Integer.parseInt(input.get(3))
        );
        emergencyMap.putIfAbsent(HEALTH_KEY, new ArrayDeque<>());
        Queue<Emergency> emergencyList = emergencyMap.get(HEALTH_KEY);
        emergencyList.offer(emergency);
        
        return emergency.toString();
    }
    
    public String registerOrderEmergency(List<String> input) {
        Emergency emergency = new OrderEmergency(
                input.get(0),
                EmergencyLevel.valueOf(input.get(1)),
                TimeFactory.create(input.get(2)),
                input.get(3)
        );
        emergencyMap.putIfAbsent(ORDER_KEY, new ArrayDeque<>());
        Queue<Emergency> emergencyList = emergencyMap.get(ORDER_KEY);
        emergencyList.offer(emergency);
        
        return emergency.toString();
    }
    
    public String registerFireServiceCenter(List<String> input) {
        EmergencyCenter emergencyCenter = new FiremanServiceCenter(input.get(0),
                Integer.parseInt(input.get(1)));
        emergencyCenterMap.putIfAbsent(FIRE_KEY, new ArrayDeque<>());
        if (!emergencyCenter.isForRetirement()){
            emergencyCenterMap.get(FIRE_KEY).offer(emergencyCenter);
        }
        
        return emergencyCenter.toString();
    }
    
    public String registerMedicalServiceCenter(List<String> input) {
        EmergencyCenter emergencyCenter = new MedicalServiceCenter(input.get(0),
                Integer.parseInt(input.get(1)));
        emergencyCenterMap.putIfAbsent(MEDICAL_KEY, new ArrayDeque<>());
        if (!emergencyCenter.isForRetirement()) {
            emergencyCenterMap.get(MEDICAL_KEY).offer(emergencyCenter);
        }
        
        return emergencyCenter.toString();
    }
    
    public String registerPoliceServiceCenter(List<String> input) {
        EmergencyCenter emergencyCenter = new PoliceServiceCenter(input.get(0),
                Integer.parseInt(input.get(1)));
        emergencyCenterMap.putIfAbsent(POLICE_KEY, new ArrayDeque<>());
        if (!emergencyCenter.isForRetirement()) {
            emergencyCenterMap.get(POLICE_KEY).offer(emergencyCenter);
        }
        
        return emergencyCenter.toString();
    }
    
    public String processEmergencies(List<String> input) {
        String emergencyType = input.get(0);
        
        Queue<Emergency> emergencyQueue = null;
        Queue<EmergencyCenter> emergencyCenterQueue = null;
        
        switch (emergencyType) {
            case PROPERTY_KEY:
                emergencyQueue = emergencyMap.get(PROPERTY_KEY);
                emergencyCenterQueue = emergencyCenterMap.get(FIRE_KEY);
                break;
            case HEALTH_KEY:
                emergencyQueue = emergencyMap.get(HEALTH_KEY);
                emergencyCenterQueue = emergencyCenterMap.get(MEDICAL_KEY);
                break;
            case ORDER_KEY:
                emergencyQueue = emergencyMap.get(ORDER_KEY);
                emergencyCenterQueue = emergencyCenterMap.get(POLICE_KEY);
                break;
        }
        
        while (true){
            if (emergencyQueue == null || emergencyQueue.size() == 0) {
                return "Successfully responded to all " + emergencyType + " emergencies.";
            }
    
            if (emergencyCenterQueue == null || emergencyCenterQueue.size() == 0) {
                return emergencyType + " Emergencies left to process: " + emergencyQueue.size() + ".";
            }
            
            Emergency emergency = emergencyQueue.poll();
            EmergencyCenter emergencyCenter = emergencyCenterQueue.poll();
            emergencyCenter.processEmergency(emergency);
            if (!emergencyCenter.isForRetirement()){
                emergencyCenterQueue.offer(emergencyCenter);
            }
            amountOfAllProcessedEmergencies++;
            switch (emergencyType) {
                case PROPERTY_KEY:
                    totalPropertyDamageOfProcessedEmergencies += emergency.getSpecialProperty();
                    break;
                case HEALTH_KEY:
                    savedCasualtiesOfProcessedEmergencies += emergency.getSpecialProperty();
                    break;
                case ORDER_KEY:
                    specialCasesProcessedCount += emergency.getSpecialProperty();
                    break;
            }
        }
//        return emergencyType + " Emergencies left to process: " + emergencyQueue.size() + ".";
    }
    
    public String emergencyReport() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRRM Services Live Statistics")
                .append(System.lineSeparator());
        int amountOfFireServiceCenters =
                emergencyCenterMap.get(FIRE_KEY) == null ? 0 : emergencyCenterMap.get(FIRE_KEY).size();
        sb.append("Fire Service Centers: ")
                .append(amountOfFireServiceCenters)
                .append(System.lineSeparator());
        int amountOfMedicalServiceCenters =
                emergencyCenterMap.get(MEDICAL_KEY) == null ? 0 : emergencyCenterMap.get(MEDICAL_KEY).size();
        sb.append("Medical Service Centers: ")
                .append(amountOfMedicalServiceCenters)
                .append(System.lineSeparator());
        int amountOfPoliceServiceCenters =
                emergencyCenterMap.get(POLICE_KEY) == null ? 0 : emergencyCenterMap.get(POLICE_KEY).size();
        sb.append("Police Service Centers: ")
                .append(amountOfPoliceServiceCenters)
                .append(System.lineSeparator());
        sb.append("Total Processed Emergencies: ")
                .append(amountOfAllProcessedEmergencies)
                .append(System.lineSeparator());
        int amountOfCurrentlyRegisteredEmergencies = getAmountOfCurrentlyRegisteredEmergencies();
        sb.append("Currently Registered Emergencies: ")
                .append(amountOfCurrentlyRegisteredEmergencies)
                .append(System.lineSeparator());
                getAmountOfTotalEmergenciesStatistics(FIRE_KEY);
        sb.append("Total Property Damage Fixed: ")
                .append(totalPropertyDamageOfProcessedEmergencies)
                .append(System.lineSeparator());
        sb.append("Total Health Casualties Saved: ")
                .append(savedCasualtiesOfProcessedEmergencies)
                .append(System.lineSeparator());
        sb.append("Total Special Cases Processed: ")
                .append(specialCasesProcessedCount)
                .append(System.lineSeparator());
        
        return sb.toString().trim();
    }
    
    private long getAmountOfTotalEmergenciesStatistics(String key) {
        long amount = 0;
        if (emergencyCenterMap.containsKey(key)) {
            for (EmergencyCenter emergencyCenter : emergencyCenterMap.get(key)) {
                amount += emergencyCenter.getProcessedStatistics();
            }
        }
        return amount;
    }
    
    private int getAmountOfCurrentlyRegisteredEmergencies() {
        int amount = 0;
        for (Queue<Emergency> emergencyList : emergencyMap.values()) {
            amount += emergencyList.size();
            
        }
        return amount;
    }
}
