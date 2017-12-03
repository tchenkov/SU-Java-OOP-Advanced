package L08_EnumerationsAndAnnotations_Exercises.P05_CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Card[] cards = new Card[2];
    
        for (int i = 0; i < cards.length; i++) {
            String rank = br.readLine().toUpperCase();
            String suit = br.readLine().toUpperCase();
    
            cards[i] = new Card(CardRank.valueOf(rank), CardSuit.valueOf(suit));
    
        }
        if (cards[0].compareTo(cards[1]) < 0){
            System.out.println(cards[1]);
        }else {
            System.out.println(cards[0]);
        }
    }
}
