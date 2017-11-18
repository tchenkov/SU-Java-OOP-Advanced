package L02_InterfacesAndAbstraction_Exercises.P10_MooD3;

public abstract class BaseGameObject implements GameObject {
    private String userName;
    private String hashPassword;
    private int level;
    
    protected BaseGameObject(String userName, int level) {
        this.userName = userName;
        this.hashPassword = this.generatePassword();
        this.level = level;
    }
    
    protected abstract String generatePassword();
    
    
    protected String getUserName() {
        return this.userName;
    }
    
    protected int getLevel() {
        return this.level;
    }
    
    protected abstract String getSpecialPointsTimesLevel();
    
    @Override
    public String toString() {
        // <”username”> | <”hashed password”> -> <character type>
        final StringBuilder output = new StringBuilder();
        output.append(
                String.format(
                        "\"%s\" | \"%s\" -> %s",
                        this.userName,
                        this.hashPassword,
                        this.getClass().getSimpleName()
                )
        );
        output.append(System.lineSeparator());
    
        // <special points * level>
        output.append(this.getSpecialPointsTimesLevel());
        
        return output.toString();
    }
}
