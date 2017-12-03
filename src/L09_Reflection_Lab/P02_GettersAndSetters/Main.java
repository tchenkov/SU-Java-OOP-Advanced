package L09_Reflection_Lab.P02_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Method[] methods = Reflection.class.getDeclaredMethods();
    
        Comparator<Method> methodComparator = Comparator.comparing(Method::getName);
        Set<Method> getters = new TreeSet<>(methodComparator);
        Set<Method> setters = new TreeSet<>(methodComparator);
    
        for (Method method : methods) {
            if (method.getName().startsWith("get")){
                getters.add(method);
            }
            if (method.getName().startsWith("set")){
                setters.add(method);
            }
        }
    
        for (Method method : getters) {
            System.out.println(
                    String.format(
                            "%s will return %s",
                            method.getName(),
                            method.getReturnType()
                    )
            );
        }
        
        for (Method method : setters) {
            Class[] returnParametersTypes = method.getParameterTypes();
            
            System.out.println(
                    String.format(
                            "%s and will set field of %s",
                            method.getName(),
                            returnParametersTypes[0]
                    )
            );
        }
    }
}
