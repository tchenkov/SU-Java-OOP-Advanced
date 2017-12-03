package L09_Reflection_Lab.P01_Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class cls = Reflection.class;
        System.out.println(cls);
        System.out.println(cls.getSuperclass());
        Class[] interfaces = cls.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    
        Reflection reflection = (Reflection) cls.newInstance();
        System.out.println(reflection);
    }
}
