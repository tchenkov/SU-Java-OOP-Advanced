package L08_EnumerationsAndAnnotations_Exercises.P08_CardGame;

public class Card implements Comparable<Card> {
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
    
    public Integer getPower(){
        return this.cardRank.getValue() + this.cardSuit.getValue();
    }
    
    @Override
    public int compareTo(Card card) {
        return this.getPower().compareTo(card.getPower());
    }
    
    
    
    @Override
    public String toString() {
        return String.format(
                "%s of %s",
                this.getCardRank(),
                this.getCardSuit(),
                this.getPower()
        );
    }
}
