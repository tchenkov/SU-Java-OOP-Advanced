package L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Command;

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
