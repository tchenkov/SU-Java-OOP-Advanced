package L06_IteratorsAndComparators_Exercises.P09_LinkedListTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int inputsCount = Integer.parseInt(br.readLine());
        
        MyLinkedList<Integer> list = new MyLinkedList<>();
    
        for (int i = 0; i < inputsCount; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            Integer integer = Integer.valueOf(input[1]);
            
            switch (command){
                case "Add":
                    list.add(integer);
                    break;
                case "Remove":
                    list.remove(integer);
            }
        }
    
        System.out.println(list.getSize());
        list.forEach(e -> System.out.print(e + " "));
    }
}
