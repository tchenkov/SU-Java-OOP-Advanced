package L08_EnumerationsAndAnnotations_Exercises.P03_CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    
    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }
    
    public String getCardRank() {
        return this.cardRank.name();
    }
    
    public String getCardSuit() {
        return this.cardSuit.name();
    }
    
    public int getPower(){
        return this.cardRank.getValue() + this.cardSuit.getValue();
    }
}
