package L06_IteratorsAndComparators_Exercises.P08_PetClinics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Clinic> clinics = new HashMap<>();
        Map<String, Pet> pets = new HashMap<>();
        
        int commandsCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < commandsCount; i++) {
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
                case "Create":
                    switch (command[1]) {
                        case "Pet":
                            createPet(pets, command);
                            break;
                        case "Clinic":
                            createClinic(clinics, command);
                    }
                    break;
                case "Add":
                    addPetInClinic(clinics, pets, command);
                    break;
                case "Release":
                    releasePetFromClinic(clinics, command);
                    break;
                case "HasEmptyRooms":
                    hasEmptyRooms(clinics, command);
                    break;
                case "Print":
                    switch (command.length) {
                        case 2:
                            printClinic(clinics, command);
                            break;
                        case 3:
                            printClinicRoom(clinics, command);
                    }
            }
        }
    }
    
    private static void printClinicRoom(Map<String, Clinic> clinics, String[] command) {
        Clinic clinic;
        clinic = clinics.get(command[1]);
        int room = Integer.parseInt(command[2]);
        System.out.println(clinic.print(room));
    }
    
    private static void printClinic(Map<String, Clinic> clinics, String[] command) {
        System.out.println(clinics.get(command[1]));
    }
    
    private static void hasEmptyRooms(Map<String, Clinic> clinics, String[] command) {
        Clinic clinic;
        clinic = clinics.get(command[1]);
        System.out.println(clinic.hasEmptyRooms());
    }
    
    private static void releasePetFromClinic(Map<String, Clinic> clinics, String[] command) {
        Clinic clinic;
        clinic = clinics.get(command[1]);
        System.out.println(clinic.releasePet());
    }
    
    private static void addPetInClinic(Map<String, Clinic> clinics, Map<String, Pet> pets, String[] command) {
        Pet pet = pets.get(command[1]);
        Clinic clinic = clinics.get(command[2]);
        System.out.println(clinic.add(pet));
    }
    
    private static void createClinic(Map<String, Clinic> clinics, String[] command) {
        try {
            Clinic clinic = new Clinic(Integer.parseInt(command[3]));
            clinics.putIfAbsent(command[2], clinic);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    
    private static void createPet(Map<String, Pet> pets, String[] command) {
        Pet pet = new Pet(command[2], Integer.parseInt(command[3]), command[4]);
        pets.putIfAbsent(command[2], pet);
    }
}
