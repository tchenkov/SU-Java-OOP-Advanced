package L17_ObjectCommunicationAndEvents_lab.P02_Command.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Command;

public class AttackCommand implements Command {
    private Attacker attacker;
    
    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }
    
    @Override
    public void execute() {
        this.attacker.attack();
    }
}
