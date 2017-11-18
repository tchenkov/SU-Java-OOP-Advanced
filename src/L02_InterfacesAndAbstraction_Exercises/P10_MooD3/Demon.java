package L02_InterfacesAndAbstraction_Exercises.P10_MooD3;

public class Demon extends BaseGameObject {
    private static final int PASSWORD_CONSTANT = 217;
    
    private double energy;
    
    public Demon(String userName, int level, double energy) {
        super(userName, level);
        this.energy = energy;
    }
    
    @Override
    protected String generatePassword() {
        return String.valueOf(
                super.getUserName().length() * PASSWORD_CONSTANT
        );
    }
    
    @Override
    protected String getSpecialPointsTimesLevel() {
        return String.valueOf(this.energy * super.getLevel());
    }
}
