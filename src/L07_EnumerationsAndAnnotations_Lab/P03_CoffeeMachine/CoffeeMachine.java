package L07_EnumerationsAndAnnotations_Lab.P03_CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coin> coins;
    private List<Coffee> coffeesSold;
    
    public CoffeeMachine() {
        this.coins = new ArrayList<>();
        this.coffeesSold = new ArrayList<>();
    }
    
    public void buyCoffee(String size, String type) {
        size = size.toUpperCase();
        type = type.toUpperCase();
        int price = CoffeeSize.valueOf(size).getCost();
        int deposit = this.coins.stream().mapToInt(Coin::getValue).sum();
        if (deposit >= price) {
            this.coffeesSold.add(
                    new Coffee(CoffeeSize.valueOf(size), CoffeeType.valueOf(type))
            );
            this.coins.clear();
        }
    }
    
    public void insertCoin(String coin) {
        this.coins.add(Coin.valueOf(coin.toUpperCase()));
    }
    
    public Iterable<Coffee> coffeesSold() {
        return this.coffeesSold;
    }
}
