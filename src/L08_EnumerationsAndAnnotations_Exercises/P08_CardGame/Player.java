package L08_EnumerationsAndAnnotations_Exercises.P08_CardGame;

import java.util.*;
import java.util.stream.Collectors;

public class Player implements Iterable<Card>{
    private String name;
    private Map<String, Card> deck;
    
    public Player(String name) {
        this.name = name;
        this.deck = new HashMap<>(5);
    }
    
    public String getName() {
        return this.name;
    }
    
    public Player() {
        this(null);
    }
    
    public void addCard(Card card){
        if (this.has(card)){
            System.out.println("Card is not in the deck.");
        }
        
        this.deck.putIfAbsent(card.toString(), card);
    }
    
    public boolean has(Card card){
        return this.deck.containsKey(card.toString());
    }
    
    public int handSize() {
        return this.deck.size();
    }
    
    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator();
    }
    
    private final class DeckIterator implements Iterator<Card>{
        List<Card> cards = new ArrayList<>(deck.values());
        int index = 0;
    
        @Override
        public boolean hasNext() {
            return this.index < cards.size();
        }
    
        @Override
        public Card next() {
            return this.cards.get(index++);
        }
    }
}
