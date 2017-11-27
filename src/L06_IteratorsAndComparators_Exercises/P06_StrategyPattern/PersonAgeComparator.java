package L06_IteratorsAndComparators_Exercises.P06_StrategyPattern;

import java.util.Comparator;

public final class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
