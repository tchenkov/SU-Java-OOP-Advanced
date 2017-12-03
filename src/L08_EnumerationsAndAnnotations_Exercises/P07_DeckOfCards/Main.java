package L08_EnumerationsAndAnnotations_Exercises.P07_DeckOfCards;

public class Main {
    public static void main(String[] args) {
        for (CardSuit cardSuit: CardSuit.values()) {
            for (CardRank cardRank : CardRank.values()) {
                System.out.println(
                        String.format(
                                "%s of %s",
                                cardRank.name(),
                                cardSuit.name()
                        )
                );
            }
        }
    }
}
