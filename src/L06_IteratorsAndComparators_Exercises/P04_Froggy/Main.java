package L06_IteratorsAndComparators_Exercises.P04_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        List<Integer> integers = Arrays.stream(br.readLine().split(", | "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        Lake<Integer> lake = new Lake<>(integers);
        
        String endCommand = br.readLine();
        if (endCommand.equals("END")){
            integers = new ArrayList<>();
            for (Integer n : lake) {
                integers.add(n);
            }
    
            System.out.println((integers.toString()).replaceAll("[\\[\\]]", ""));
        }
    }
}
