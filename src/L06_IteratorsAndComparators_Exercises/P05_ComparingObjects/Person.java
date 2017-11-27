package L06_IteratorsAndComparators_Exercises.P05_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private String town;
    
    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }
    
    public boolean equals(Person person){
        return this.compareTo(person) == 0;
    }
    
    @Override
    public int compareTo(Person person) {
        if (!this.name.equals(person.name)){
            return this.name.compareTo(person.name);
        }
        
        if (!this.age.equals(person.age)){
            return this.age.compareTo(person.age);
        }
        
        return this.town.compareTo(person.town);
    }
}
