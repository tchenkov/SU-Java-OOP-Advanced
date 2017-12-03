package L08_EnumerationsAndAnnotations_Exercises.P08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private final static int HAND_SIZE = 5;
    private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static List<String> usedCards = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
    
        List<Player> players = new ArrayList<>();
        
        Player player1 = new Player(READER.readLine());
        Player player2 = new Player(READER.readLine());
    
        Collections.addAll(players, player1, player2);
        
        getCards(player1, HAND_SIZE);
        getCards(player2, HAND_SIZE);
        
        play(players);
    }
    
    private static void play(List<Player> players) {
        Player winner = null;
        Card winningCard = null;
    
        for (Player player : players) {
            for (Card card : player) {
                if (winningCard == null || winningCard.getPower() < card.getPower()){
                    winner = player;
                    winningCard = card;
                }
            }
        }
    
        System.out.println(
                String.format(
                        "%s wins with %s.",
                        winner.getName(),
                        winningCard.toString()
                )
        );
    }
    
    private static void getCards(Player player, int cardsCount) throws IOException {
        
        do {
            try {
                String[] cardInput = READER.readLine().split(" of ");
                CardRank cardRank = CardRank.valueOf(cardInput[0]);
                CardSuit cardSuit = CardSuit.valueOf(cardInput[1]);
                
                Card card = new Card(cardRank, cardSuit);
    
                if (usedCards.contains(card.toString())){
                    System.out.println("Card is not in the deck.");
                    continue;
                }
                
                player.addCard(card);
                usedCards.add(card.toString());
    
            } catch (IllegalArgumentException e) {
                System.out.println("No such card exists.");
                continue;
            }
            
        } while (player.handSize() < cardsCount);
    }
}
