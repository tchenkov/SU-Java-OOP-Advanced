package L01_InterfacesAndAbstraction_Lab.P04_SayHelloExtended;

public class European extends BasePerson implements Person {
    public European(String name) {
        super(name);
    }
    
    @Override
    public String sayHello() {
        return "Hello";
    }
}
