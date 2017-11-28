package L07_EnumerationsAndAnnotations_Lab.P03_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        
        String[] command = br.readLine().split(" ");
        
        while (!command[0].equals("END")){
            if (command.length == 1){
                coffeeMachine.insertCoin(command[0]);
            } else if (command.length == 2){
                coffeeMachine.buyCoffee(command[0], command[1]);
            }
    
            command = br.readLine().split(" ");
        }
    
        for (Coffee coffee:coffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
