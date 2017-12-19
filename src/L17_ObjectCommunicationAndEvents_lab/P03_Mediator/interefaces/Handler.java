package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.enumeration.LogType;

public interface Handler {
    void handle(LogType type, String message);
    
    void setSuccessor(Handler successor);
}
