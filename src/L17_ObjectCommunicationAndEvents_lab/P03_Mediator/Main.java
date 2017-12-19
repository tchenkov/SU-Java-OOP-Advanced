package L17_ObjectCommunicationAndEvents_lab.P03_Mediator;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.CommandExecutor;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands.AttackCommand;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands.GroupAttackCommand;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands.GroupTargetCommand;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands.TargetCommand;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.*;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.logger.CombatLogger;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.logger.EventLogger;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.models.Dragon;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.models.Group;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.models.heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Handler combatHandler = new CombatLogger();
        Handler eventHandler = new EventLogger();
        
        combatHandler.setSuccessor(eventHandler);
    
        Attacker attacker1 = new Warrior("Kyncho", 5, combatHandler);
        Attacker attacker2 = new Warrior("Iliq", 5, combatHandler);
        Attacker attacker3 = new Warrior("Evlogi", 5, combatHandler);
        Attacker attacker4 = new Warrior("Kuzman", 5, combatHandler);
        Target target = new Dragon("Drako", 20, 8, combatHandler);
        
        AttackGroup attackGroup = new Group();
        attackGroup.addMember(attacker1);
        attackGroup.addMember(attacker2);
        attackGroup.addMember(attacker3);
        attackGroup.addMember(attacker4);
        
        
        Executor executor = new CommandExecutor();
        Command groupTarget = new GroupTargetCommand(attackGroup, target);
        Command groupAttack = new GroupAttackCommand(attackGroup);
        
        executor.executeCommand(groupTarget);
        executor.executeCommand(groupAttack);
    }
}
