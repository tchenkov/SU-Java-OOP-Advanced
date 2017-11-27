package L06_IteratorsAndComparators_Exercises.P06_StrategyPattern;

import java.util.Comparator;

public final class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getName().length() != p2.getName().length()){
            return p1.getName().length() - p2.getName().length();
        }
        
        return p1.getName().substring(0).toLowerCase().compareTo(p2.getName().substring(0).toLowerCase());
    }
}
