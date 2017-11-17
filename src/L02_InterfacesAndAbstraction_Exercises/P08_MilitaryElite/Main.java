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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Soldier> soldiers = new LinkedList<>();
        String inputLine = br.readLine();
        
        while (!inputLine.equals("End")) {
            String[] tokens = inputLine.split("\\s+");
            Soldier aPrivate = null;
            switch (tokens[0]) {
                case "Private":
                    // 0:Private 1:<id> 2:<firstName> 3:<lastName> 4:<salary>
                    aPrivate = new PrivateImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    break;
                case "LeutenantGeneral":
                    // 0:LeutenantGeneral 1:<id> 2:<firstName> 3:<lastName> 4:<salary>
                    // 5:<private1Id> 6:<private2Id> … n:<privateNId>
                    List<Private> privateList = getPrivateList(soldiers, tokens);
                    aPrivate = new LeutenantGeneralImpl(tokens[1], tokens[2], tokens[3],
                            Double.parseDouble(tokens[4]), privateList);
                    break;
                case "Engineer":
                    // 0:Engineer 1:<id> 2:<firstName> 3:<lastName> 4:<salary> 5:<corps> :6<repair1Part> :7<repair1Hours>
                    // … n:<repairNPart> n+1:<repairNHours>
                    List<Repair> repairs = getRepairsList(tokens);
                    aPrivate = new EngineerImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]),
                            tokens[5], repairs);
                    break;
                case "Commando":
                    // 0:Commando 1:<id> 2:<firstName> 3:<lastName> 4:<salary> 5:<corps> 6:<mission1CodeName> 7:<mission1state>
                    // … n:<missionNCodeName> n+1:<missionNstate>
                    List<Missions> missions = getMissions(tokens);
                    aPrivate = new CommandoImpl(tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]),
                            tokens[5], missions);
                    break;
                case "Spy":
                    aPrivate = new SpyImpl(tokens[1], tokens[2], tokens[3], tokens[4]);
            }
            
            if (aPrivate != null){
                soldiers.add(aPrivate);
            }
            
            inputLine = br.readLine();
        }
    }
    
    private static List<Repair> getRepairsList(String[] tokens) {
        return null;// todo
    }
    
    private static List<Missions> getMissions(String[] tokens) {
        List<Missions> missions = new ArrayList<>(tokens.length - 6);
        for (int i = 6; i < tokens.length - 1; i += 2) {
            missions.add(new MissionsImpl(tokens[i], tokens[i + 1]));
        }
    
        return missions;
    }
    
    private static List<Repair> getPrivateList(String[] tokens) {
        List<Repair> repairs = new ArrayList<>(tokens.length - 6);
        for (int i = 6; i < tokens.length - 1; i += 2) {
            repairs.add(
                    new RepairImpl(tokens[i], Integer.parseInt(tokens[i + 1]))
            );
        }
        
        return repairs;
    }
    
    private static List<Private> getPrivateList(List<Soldier> soldiers, String[] tokens) {
        List<Private> privateList = new ArrayList<>(tokens.length - 5);
        // 0:LeutenantGeneral 1:<id> 2:<firstName> 3:<lastName> 4:<salary>
        // 5:<private1Id> 6:<private2Id> … n:<privateNId>
        for (int i = 5; i < tokens.length; i++) {
            int index = i;
            // todo
            Private selectedPrivate = soldiers.stream()
                    .filter(pr -> pr.getId().equals(tokens[index]))
                    .findFirst()
                    .get();
            if (selectedPrivate != null && !privateList.contains(selectedPrivate)) {
                privateList.add(selectedPrivate);
            }
        }
        
        return privateList;
    }
}
