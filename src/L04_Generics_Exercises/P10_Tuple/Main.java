package L04_Generics_Exercises.P10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tu1 = br.readLine().split(" (?=[^ ]+$)");
        String name1 = tu1[0];
        String address1 = tu1[1];
    
        String[] tu2 = br.readLine().split(" (?=[^ ]+$)");
        String name2 = tu2[0];
        int beer2 = Integer.parseInt(tu2[1]);
    
        String[] tu3 = br.readLine().split(" (?=[^ ]+$)");
        int int3 = Integer.parseInt(tu3[0]);
        double double3 = Double.parseDouble(tu3[1]);
        
        Tuple[] tuples = new Tuple[3];
        tuples[0] = new Tuple(name1, address1);
        tuples[1] = new Tuple(name2, beer2);
        tuples[2] = new Tuple(int3, double3);
    
        for (Tuple tuple : tuples) {
            System.out.println(tuple);
        }
    }
}
