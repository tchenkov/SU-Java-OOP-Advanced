package bg.softuni;

import bg.softuni.core.EmergencyManagementSystem;
import bg.softuni.interfaces.Emergency;
import bg.softuni.interfaces.EmergencyCenter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private final static String TERMINATION_COMMAND = "EmergencyBreak";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        EmergencyManagementSystem ems = new EmergencyManagementSystem();
        
        while (true){
            String commandInput;
            if (TERMINATION_COMMAND.equals(commandInput = br.readLine())){
                break;
            }
            
            List<String> tokens = Arrays.stream(commandInput.split("\\|")).collect(Collectors.toList());
            String command = tokens.remove(0);
            String output = null;
            
            switch (command){
                case "RegisterPropertyEmergency":
                    output = ems.registerPropertyEmergency(tokens);
                    break;
                case "RegisterHealthEmergency":
                    output = ems.registerHealthEmergency(tokens);
                    break;
                case "RegisterOrderEmergency":
                    output = ems.registerOrderEmergency(tokens);
                    break;
                case "RegisterFireServiceCenter":
                    output = ems.registerFireServiceCenter(tokens);
                    break;
                case "RegisterMedicalServiceCenter":
                    output = ems.registerMedicalServiceCenter(tokens);
                    break;
                case "RegisterPoliceServiceCenter":
                    output = ems.registerPoliceServiceCenter(tokens);
                    break;
                case "ProcessEmergencies":
                    output = ems.processEmergencies(tokens);
                    break;
                case "EmergencyReport":
                    output = ems.emergencyReport();
                    break;
            }
            
            if (output != null){
                System.out.println(output);
            }
        }
    }
}
