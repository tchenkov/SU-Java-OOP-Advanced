package L17_ObjectCommunicationAndEvents_lab.P01_Logger.interefaces;

import L17_ObjectCommunicationAndEvents_lab.P01_Logger.enumeration.LogType;

public interface Handler {
    void handle(LogType type, String message);
    
    void setSuccessor(Handler successor);
}
