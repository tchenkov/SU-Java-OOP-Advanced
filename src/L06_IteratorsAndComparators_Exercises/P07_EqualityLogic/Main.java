package L06_IteratorsAndComparators_Exercises.P07_EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
    
        Set<Person> peopleTreeSet = new TreeSet<>();
        Set<Person> peopleHashSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String[] tokens = br.readLine().split(" ");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            
            peopleTreeSet.add(person);
            peopleHashSet.add(person);
        }
    
        System.out.println(peopleTreeSet.size());
        System.out.println(peopleHashSet.size());
    }
}
