package L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.AttackGroup;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Command;

public class GroupAttackCommand implements Command {
    private AttackGroup attackGroup;
    
    public GroupAttackCommand(AttackGroup attackGroup) {
        this.attackGroup = attackGroup;
    }
    
    @Override
    public void execute() {
        attackGroup.groupAttack();
    }
}
