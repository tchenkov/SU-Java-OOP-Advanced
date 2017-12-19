package L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces;

public interface AttackGroup {
    
    void addMember(Attacker attacker);
    
    void groupTarget(Target target);
    
    void groupAttack();
}
