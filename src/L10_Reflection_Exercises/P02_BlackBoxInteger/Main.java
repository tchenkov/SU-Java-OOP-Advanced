package L10_Reflection_Exercises.P02_BlackBoxInteger;

import L10_Reflection_Exercises.P02_BlackBoxInteger.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class<BlackBoxInt> targetClass = BlackBoxInt.class;
        Constructor[] constructors = targetClass.getDeclaredConstructors();//
        Constructor targetConstructor = null;
    
        for (Constructor constructor : constructors) {
            if (constructor.getParameterCount() == 0){
                targetConstructor = constructor;
                break;
            }
        }
    
        assert targetConstructor != null;
        targetConstructor.setAccessible(true);//
        BlackBoxInt blackBoxInt = (BlackBoxInt) targetConstructor.newInstance();
        List<String> methodsNames = Arrays.stream(blackBoxInt.getClass().getDeclaredMethods())
                .map(Method::getName).collect(Collectors.toList());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true){
            String[] tokens = br.readLine().split("_");
            if (tokens[0].equals("END")){
                break;
            }
            String methodName = tokens[0];
            
            if (!methodsNames.contains(methodName)){
                System.out.println("no such method");
                continue;
            }
            
            int argument = Integer.parseInt(tokens[1]);
            Method method = blackBoxInt.getClass().getDeclaredMethod(methodName, int.class);//
            method.setAccessible(true);//
            method.invoke(blackBoxInt, argument);
            Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
            field.setAccessible(true);//
            System.out.println(field.get(blackBoxInt));
    
        }
    }
}
