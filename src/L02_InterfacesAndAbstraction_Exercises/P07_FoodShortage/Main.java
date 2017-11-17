package L02_InterfacesAndAbstraction_Exercises.P07_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Buyer> buyers = new LinkedHashMap<>();
        
        int buyersCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < buyersCount; i++) {
            String[] buyerInfo = br.readLine().split(" ");
            Buyer buyer = createNewBuyer(buyerInfo);
            buyers.putIfAbsent(buyer.getName(), buyer);
        }
        
        
        String name = br.readLine();
        
        while (!name.equals("End")) {
            if (buyers.containsKey(name)){
                buyers.get(name).buyFood();
            }
            name = br.readLine();
        }
    
        int food = buyers.values().stream()
                .mapToInt(Buyer::getFood)
                .sum();
        
        System.out.println(food);
    }
    
    private static Buyer createNewBuyer(String[] buyerInfo) {
        switch (buyerInfo.length) {
            case 4:
                return new Citizen(buyerInfo[0], Integer.parseInt(buyerInfo[1]),
                        buyerInfo[2], buyerInfo[3]);
            case 3:
                return new Rebel(buyerInfo[0], Integer.parseInt(buyerInfo[1]), buyerInfo[2]);
            default:
                return null;
        }
    }
}
