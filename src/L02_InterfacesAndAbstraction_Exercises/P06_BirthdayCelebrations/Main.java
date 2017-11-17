package L02_InterfacesAndAbstraction_Exercises.P06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Subject> subjects = new LinkedList<>();
        
        String command = br.readLine();
        while (!command.equals("End")){
            String[] subjectInfo = command.split(" ");
            Subject subject = null;
            
            switch (subjectInfo[0]){
                case "Citizen":
                    subject = new Citizen(subjectInfo[1], Integer.parseInt(subjectInfo[2]),
                            subjectInfo[3], subjectInfo[4]);
                    break;
                    case "Pet":
                    subject = new Pet(subjectInfo[1], subjectInfo[2]);
                    break;
                case "Robot":
                    subject = new Robot(subjectInfo[1], subjectInfo[2]);
                    break;
                    
            }
            subjects.add(subject);
            
            command = br.readLine();
        }
        
        String filter = br.readLine();
        
        subjects.stream()
                .filter(subject -> subject.getBirthdate() != null)
                .filter(subject -> subject.getBirthdate().endsWith(filter))
                .forEach(subject -> System.out.println(subject.getBirthdate()));
    }
}
