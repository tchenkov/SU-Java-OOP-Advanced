package L17_ObjectCommunicationAndEvents_lab.P02_Command;

import L17_ObjectCommunicationAndEvents_lab.P02_Command.executor.CommandExecutor;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.executor.commands.AttackCommand;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.executor.commands.TargetCommand;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.*;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.logger.CombatLogger;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.logger.EventLogger;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.models.Dragon;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.models.heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Handler combatHandler = new CombatLogger();
        Handler eventHandler = new EventLogger();
        
        combatHandler.setSuccessor(eventHandler);
    
        Attacker attacker = new Warrior("Kyncho", 5, combatHandler);
        Target target = new Dragon("Drako", 5, 8, combatHandler);
        
        Executor executor = new CommandExecutor();
        Command targetCommand = new TargetCommand(attacker, target);
        Command attackCommand = new AttackCommand(attacker);
        
        executor.executeCommand(targetCommand);
        executor.executeCommand(attackCommand);
        executor.executeCommand(attackCommand);
    }
}
