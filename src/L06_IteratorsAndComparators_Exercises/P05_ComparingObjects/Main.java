package L06_IteratorsAndComparators_Exercises.P05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = getPeople(br);
                new ArrayList<>();
        
        int matchesCount = getMatchesCount(people, br);
        
        if (matchesCount == 1){
            System.out.println("No matches");
        }
        else {
            System.out.println(
                    String.format(
                            "%d %d %d",
                            matchesCount,
                            people.size() - matchesCount,
                            people.size()
                    )
            );
        }
    }
    
    private static int getMatchesCount(List<Person> people, BufferedReader br) throws IOException {
        int personIndex = Integer.parseInt(br.readLine()) - 1;
        Person person = people.get(personIndex);
        
        int counter = 0;
    
        for (Person someone : people) {
            if (person.equals(someone)){
                counter++;
            }
        }
        
        return counter;
    }
    
    public static List<Person> getPeople(BufferedReader br) throws IOException{
        List<Person> people = new ArrayList<>();
        
        String command = br.readLine();
    
        while (!command.equals("END")){
            String[] tokens = command.split(" ");
            people.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
        
            command = br.readLine();
        }
        return people;
    }
}
