package L17_ObjectCommunicationAndEvents_lab.P01_Logger;

import L17_ObjectCommunicationAndEvents_lab.P01_Logger.interefaces.Attacker;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.interefaces.Handler;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.interefaces.Target;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.logger.CombatLogger;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.logger.EventLogger;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.models.Dragon;
import L17_ObjectCommunicationAndEvents_lab.P01_Logger.models.heroes.Warrior;

public class Main {
    public static void main(String[] args) {
    
        Handler combatHandler = new CombatLogger();
        Handler eventHandler = new EventLogger();
        
        combatHandler.setSuccessor(eventHandler);
    
        Attacker attacker = new Warrior("Kyncho", 5, combatHandler);
        Target target = new Dragon("Drako", 5, 8, combatHandler);
        
        attacker.setTarget(target);
        attacker.attack();
        attacker.attack();
    }
}
