package L17_ObjectCommunicationAndEvents_lab.P02_Command.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Target;

public class TargetCommand implements Command {
    private Attacker attacker;
    private Target target;
    
    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }
    
    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
