package L02_InterfacesAndAbstraction_Exercises.P10_MooD3;

public class Archangel extends BaseGameObject {
    private static final int PASSWORD_CONSTANT = 21;
    private int mana;
    
    public Archangel(String userName, int level, int mana) {
        super(userName, level);
        this.mana = mana;
    }
    
    @Override
    protected String generatePassword() {
        return new StringBuilder(super.getUserName()).reverse().toString() +
                (super.getUserName().length() * PASSWORD_CONSTANT);
    }
    
    @Override
    protected String getSpecialPointsTimesLevel() {
        return String.valueOf(this.mana * super.getLevel());
    }
}
