package L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.enumeration.LogType;

public interface Handler {
    void handle(LogType type, String message);
    
    void setSuccessor(Handler successor);
}
