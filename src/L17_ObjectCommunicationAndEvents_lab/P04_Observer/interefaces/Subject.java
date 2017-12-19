package L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
