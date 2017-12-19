package L17_ObjectCommunicationAndEvents_lab.P04_Observer.models.heroes;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.enumeration.LogType;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Handler;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Target;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.models.AbstractHero;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";
    
    public Warrior(String id, int dmg, Handler handler) {
        super(id, dmg, handler);
    }
    
    @Override
    protected void executeClassSpecificAttack(Target target, int dmg) {
        super.getHandler().handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }
}
