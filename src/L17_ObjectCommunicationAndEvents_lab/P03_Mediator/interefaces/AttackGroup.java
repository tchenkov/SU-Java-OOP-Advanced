package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces;

public interface AttackGroup {
    
    void addMember(Attacker attacker);
    
    void groupTarget(Target target);
    
    void groupAttack();
}
