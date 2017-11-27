package L06_IteratorsAndComparators_Exercises.P06_StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int personsCount = Integer.parseInt(br.readLine());
    
        Set<Person> peopleByName = new TreeSet<>(new PersonNameComparator());
        Set<Person> peopleByAge = new TreeSet<>(new PersonAgeComparator());
        
        for (int i = 0; i < personsCount; i++) {
            String[] personInfo = br.readLine().split(" ");
            
            Person person = new Person(personInfo[0], Integer.parseInt(personInfo[1]));
            
            peopleByName.add(person);
            peopleByAge.add(person);
        }
        
        peopleByName.forEach(System.out::println);
        peopleByAge.forEach(System.out::println);
    }
}
