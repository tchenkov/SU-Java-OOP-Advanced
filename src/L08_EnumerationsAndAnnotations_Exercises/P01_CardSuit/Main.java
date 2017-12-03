package L08_EnumerationsAndAnnotations_Exercises.P01_CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.println(
                    String.format(
                            "Ordinal value: %d; Name value: %s",
                            cardSuit.ordinal(),
                            cardSuit.name()
                    )
            );
        }
    }
}
