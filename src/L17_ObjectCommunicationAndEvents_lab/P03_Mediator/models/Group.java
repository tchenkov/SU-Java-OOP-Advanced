package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.models;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.AttackGroup;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Target;

import java.util.HashSet;
import java.util.Set;

public class Group implements AttackGroup {
    private Set<Attacker> attackers;
    
    public Group() {
        this.attackers = new HashSet<>();
    }
    
    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }
    
    @Override
    public void groupTarget(Target target) {
        for (Attacker attacker : this.attackers) {
            attacker.setTarget(target);
        }
    }
    
    @Override
    public void groupAttack() {
        for (Attacker attacker : this.attackers) {
            attacker.attack();
        }
    }
}
