package L07_EnumerationsAndAnnotations_Lab.P02_WarningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private Importance minImportance;
    private List<Message> messages;
    
    public Logger(Importance minImportance) {
        this.minImportance = minImportance;
        this.messages = new ArrayList<>();
    }
    
    public void addMessage(Message message){
        if (minImportance.compareTo(message.getImportance()) <= 0){
            this.messages.add(message);
        }
    }
    
    public Iterable<Message> getMessages(){
        return this.messages;
    }
}
