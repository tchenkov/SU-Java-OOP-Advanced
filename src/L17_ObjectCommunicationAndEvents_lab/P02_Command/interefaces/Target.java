package L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();
}