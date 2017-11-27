package L06_IteratorsAndComparators_Exercises.P07_EqualityLogic;

public class Person implements Comparable<Person> {
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
    public int compareTo(Person person) {
        if (this.name.equals(person.name)) {
            return this.age - person.age;
        }
        
        return this.name.compareTo(person.name);
    }
    
    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = 19 * hashCode + (this.name != null ? this.name.hashCode() : 0);
        hashCode = 19 * hashCode + this.age;
        
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
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
