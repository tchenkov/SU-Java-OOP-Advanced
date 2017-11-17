package L02_InterfacesAndAbstraction_Exercises.P05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Subject> subjects = new LinkedList<>();
        
        String command = br.readLine();
        while (!command.equals("End")){
            String[] subjectInfo = command.split(" ");
            Subject subject = null;
            if (subjectInfo.length == 2){
                subject = new Robot(subjectInfo[0], subjectInfo[1]);
            }
            else {
                subject = new Citizen(subjectInfo[0], Integer.parseInt(subjectInfo[1]), subjectInfo[2]);
            }
            subjects.add(subject);
            
            command = br.readLine();
        }
        
        String filter = br.readLine();
        
        subjects.stream()
                .filter(subject -> subject.getId().endsWith(filter))
                .forEach(subject -> System.out.println(subject.getId()));
    }
}
