package L06_IteratorsAndComparators_Exercises.P01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ListyIterator listyIterator = null;
        
        String command = br.readLine();
        
        while (!command.equals("END")){
            String[] instructions = command.split(" ");
            
            switch (instructions[0]){
                case "Create":
                    List<String> elements = Arrays.stream(instructions)
                            .skip(1)
                            .collect(Collectors.toList());
                    listyIterator = new ListyIterator(elements);
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
            }
            
            command = br.readLine();
        }
    }
}
