package L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.AttackGroup;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Target;

public class GroupTargetCommand implements Command {
    private AttackGroup attackGroup;
    private Target target;
    
    public GroupTargetCommand(AttackGroup attackGroup, Target target) {
        this.attackGroup = attackGroup;
        this.target = target;
    }
    
    @Override
    public void execute() {
        attackGroup.groupTarget(this.target);
    }
}
