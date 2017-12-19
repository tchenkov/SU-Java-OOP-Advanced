package L17_ObjectCommunicationAndEvents_lab.P04_Observer;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.CommandExecutor;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.commands.GroupAttackCommand;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor.commands.GroupTargetCommand;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.*;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.logger.CombatLogger;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.logger.EventLogger;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.models.Dragon;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.models.Group;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.models.heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Handler combatHandler = new CombatLogger();
        Handler eventHandler = new EventLogger();
        
        combatHandler.setSuccessor(eventHandler);
    
        ObservableAttacker attacker1 = new Warrior("Kyncho", 5, combatHandler);
        ObservableAttacker attacker2 = new Warrior("Iliq", 5, combatHandler);
        ObservableAttacker attacker3 = new Warrior("Evlogi", 5, combatHandler);
        ObservableAttacker attacker4 = new Warrior("Kuzman", 5, combatHandler);
        SubjectableTarget target = new Dragon("Drako", 20, 8, combatHandler);
        
        AttackGroup attackGroup = new Group();
        attackGroup.addMember(attacker1);
        attackGroup.addMember(attacker2);
        attackGroup.addMember(attacker3);
        attackGroup.addMember(attacker4);
    
        target.register(attacker1);
        target.register(attacker2);
        target.register(attacker3);
        target.register(attacker4);
        
        Executor executor = new CommandExecutor();
        Command groupTarget = new GroupTargetCommand(attackGroup, target);
        Command groupAttack = new GroupAttackCommand(attackGroup);
        
        executor.executeCommand(groupTarget);
        executor.executeCommand(groupAttack);
    }
}
