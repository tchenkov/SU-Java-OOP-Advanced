package L01_InterfacesAndAbstraction_Lab.P03_SayHello;

public class Bulgarian implements Person {
    private String name;
    
    public Bulgarian(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String sayHello() {
        return "Здравей";
    }
}
