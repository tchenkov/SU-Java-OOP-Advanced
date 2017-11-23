package L04_Generics_Exercises.P07_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        CustomList<String> customList = new CustomListImpl<>();
        
        String command = br.readLine();
        
        while (!command.equals("END")){
            String[] instruction = command.split(" ");
            
            switch (instruction[0]){
                case "Add":
                    customList.add(instruction[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(instruction[1]));
                    break;
                case "Contains":
                    System.out.println(
                            customList.contains(instruction[1])
                    );
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(instruction[1]), Integer.parseInt(instruction[2]));
                    break;
                case "Greater":
                    System.out.println(
                            customList.countGreaterThan(instruction[1])
                    );
                    break;
                case "Max":
                    System.out.println(
                            customList.getMax()
                    );
                    break;
                case "Min":
                    System.out.println(
                            customList.getMin()
                    );
                    break;
                case "Print":
                    for (String item : customList) {
                        System.out.println(item);
                    }
            }
    
            command = br.readLine();
        }
    }
}
