package L02_InterfacesAndAbstraction_Exercises.P10_MooD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tokens = br.readLine().split(" \\| ");
        String userName = tokens[0];
        String characterType = tokens[1];
        int level = Integer.parseInt(tokens[3]);
        
        
        GameObject player = null;
        
        switch (characterType){
            case "Archangel":
                int mana = Integer.parseInt(tokens[2]);
                player = new Archangel(userName, level, mana);
                break;
            case "Demon":
                double energy = Double.parseDouble(tokens[2]);
                player = new Demon(userName, level, energy);
        }
        
        if (player != null){
            System.out.println(player);
        }
    
    }
}
