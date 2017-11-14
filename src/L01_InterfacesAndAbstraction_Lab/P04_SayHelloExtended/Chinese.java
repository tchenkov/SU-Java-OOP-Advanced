package L01_InterfacesAndAbstraction_Lab.P04_SayHelloExtended;

public class Chinese extends BasePerson implements Person {
    public Chinese(String name) {
        super(name);
    }
    
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
