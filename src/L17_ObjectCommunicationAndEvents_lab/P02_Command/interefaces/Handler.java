package L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces;

import L17_ObjectCommunicationAndEvents_lab.P02_Command.enumeration.LogType;

public interface Handler {
    void handle(LogType type, String message);
    
    void setSuccessor(Handler successor);
}
