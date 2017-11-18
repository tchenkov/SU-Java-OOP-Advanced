package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Private;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.PrivateImpl;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.LeutenantGeneralImpl;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers.CommandoImpl;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.Privates.SpecialisedSoldiers.EngineerImpl;
import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers.SpyImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Map<String, Soldier> soldiers = getSolders();
        
        soldiers.values().forEach(s -> System.out.println(s.toString().trim()));
    }
    
    private static Map<String, Soldier> getSolders() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Soldier> soldiers = new LinkedHashMap<>();
        String command = br.readLine();
        
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            Soldier soldier = null;
            try {
                switch (tokens[0]) {
                    case "Private":
                        soldier = new PrivateImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                        break;
                    case "LeutenantGeneral":
                        List<Private> privates = getPrivates(tokens, soldiers);
                        soldier = new LeutenantGeneralImpl(tokens[1], tokens[2], tokens[3],
                                Double.parseDouble(tokens[4]), privates);
                        break;
                    case "Engineer":
                        List<Repair> repairs = getRepairsList(tokens);
                        soldier = new EngineerImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]),
                                tokens[5], repairs);
                        break;
                    case "Commando":
                        List<Mission> missions = getMissions(tokens);
                        soldier = new CommandoImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]),
                                tokens[5], missions);
                        break;
                    case "Spy":
                        soldier = new SpyImpl(tokens[1], tokens[2], tokens[3], tokens[4]);
                        break;
                    
                }
            }
            catch (IllegalArgumentException iae) {
            }
            
            if (soldier != null) {
                soldiers.putIfAbsent(soldier.getId(), soldier);
            }
            
            command = br.readLine();
        }
        
        return soldiers;
    }
    
    private static List<Mission> getMissions(String[] tokens) {
        List<Mission> missions = new LinkedList<>();
        for (int i = 6; i < tokens.length; i += 2) {
            try {
                missions.add(new MissionImpl(tokens[i], tokens[i + 1]));
            }
            catch (IllegalArgumentException iae) {
            }
            catch (IndexOutOfBoundsException iobe) {
            }
        }
        
        return missions;
    }
    
    private static List<Repair> getRepairsList(String[] tokens) {
        List<Repair> repairs = new LinkedList<>();
        for (int i = 6; i < tokens.length; i += 2) {
            try {
                repairs.add(new RepairImpl(tokens[i], Integer.parseInt(tokens[i + 1])));
            }
            catch (IllegalArgumentException iae) {
            }
            catch (IndexOutOfBoundsException iobe) {
            }
        }
        
        return repairs;
    }
    
    private static List<Private> getPrivates(String[] tokens, Map<String, Soldier> soldiers) {
        List<Private> privates = new ArrayList<>();
        for (int i = 5; i < tokens.length; i++) {
            privates.add((Private) soldiers.get(tokens[i]));
        }
        
        return privates;
    }
}
