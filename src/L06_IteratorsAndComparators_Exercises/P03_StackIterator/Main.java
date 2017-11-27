package L06_IteratorsAndComparators_Exercises.P03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> integerStack = new StackImpl<>();
        
        String command = br.readLine();
        
        while (!command.equals("END")){
            String instruction = command.split(" ")[0];
            
            switch (instruction){
                case "Push":
                    command = command.substring(command.indexOf(" "));
                    List<Integer> elements = Arrays.stream(command.split(", "))
                            .map(n -> Integer.valueOf(n.trim()))
                            .collect(Collectors.toList());
                    integerStack.push(elements);
                    break;
                case "Pop":
                    integerStack.pop();
            }
            
            command = br.readLine();
        }
        
        integerStack.forEach(System.out::println);
        integerStack.forEach(System.out::println);
    }
}
