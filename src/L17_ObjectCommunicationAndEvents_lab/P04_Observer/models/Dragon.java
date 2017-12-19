package L17_ObjectCommunicationAndEvents_lab.P04_Observer.models;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.enumeration.LogType;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Handler;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.ObservableAttacker;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Observer;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.SubjectableTarget;

import java.util.HashSet;
import java.util.Set;

public class Dragon implements SubjectableTarget {

    private static final String THIS_DIED_EVENT = "%s dies";

    private String id;
    private int hp;
    private int reward;
    private boolean eventTriggered;
    private Handler handler;
    private Set<Observer> observableAttackers;

    public Dragon(String id, int hp, int reward, Handler handler) {
        this.id = id;
        this.hp = hp;
        this.reward = reward;
        this.handler = handler;
        this.observableAttackers = new HashSet<>();
    }

    @Override
    public void receiveDamage(int dmg) {
        if (!this.isDead()) {
            this.hp -= dmg;
        }

        if (this.isDead() && !eventTriggered) {
            this.handler.handle(LogType.EVENT, String.format(THIS_DIED_EVENT, this));
            this.eventTriggered = true;
            this.notifyObservers();
        }
    }

    @Override
    public boolean isDead() {
        return this.hp <= 0;
    }

    @Override
    public String toString() {
        return this.id;
    }
    
    @Override
    public void register(Observer observer) {
        this.observableAttackers.add(observer);
    }
    
    @Override
    public void unregister(Observer observer) {
        this.observableAttackers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : this.observableAttackers) {
            observer.update(this.reward);
        }
    }
}
