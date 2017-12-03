package L08_EnumerationsAndAnnotations_Exercises.P01_CardSuit;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);
    
    private int value;
    
    CardSuit(int value) {
        this.value = value;
    }
}
