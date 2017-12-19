package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.AttackGroup;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Command;

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
