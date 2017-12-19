package L17_ObjectCommunicationAndEvents_lab.P04_Observer.logger;


import L17_ObjectCommunicationAndEvents_lab.P04_Observer.enumeration.LogType;

public class EventLogger extends BaseLogger {
    public EventLogger() {
    }
    
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.EVENT) {
            System.out.println(type.name() + ": " + message);
        }
        else {
            if (super.getSuccessor() != null){
                super.getSuccessor().handle(type, message);
            }
        }
    }
}
