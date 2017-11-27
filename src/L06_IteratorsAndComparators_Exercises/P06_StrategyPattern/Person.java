package L06_IteratorsAndComparators_Exercises.P06_StrategyPattern;

public class Person{
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s %d",
                this.name,
                this.age
        );
    }
}
