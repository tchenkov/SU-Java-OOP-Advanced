package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Command;

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
