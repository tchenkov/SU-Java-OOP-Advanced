package L07_EnumerationsAndAnnotations_Lab.P02_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Importance minImportance = Importance.valueOf(br.readLine().toUpperCase());
        Logger logger = new Logger(minImportance);
        
        String command = br.readLine();
        
        while (!command.equals("END")){
            String[] tokens = command.split(": ");
            Importance importance = Importance.valueOf(tokens[0].toUpperCase());
            String message = tokens[1];
            
            logger.addMessage(new Message(importance, message));
            
            command = br.readLine();
        }
    
        for (Message message:logger.getMessages()) {
            System.out.println(message);
        }
    }
}
