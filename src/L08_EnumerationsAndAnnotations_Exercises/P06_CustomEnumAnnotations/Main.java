package L08_EnumerationsAndAnnotations_Exercises.P06_CustomEnumAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String packageName = Main.class.getCanonicalName();
        
        String className = br.readLine();
        
        Class<?> aClass = Class.forName(packageName.replace("Main", className));
        
        //noinspection Duplicates
        if (aClass != null)
        {
            Annotation[] annotations = aClass.getAnnotations();
    
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(CustomAnnotation.class)){
                    System.out.println(
                            String.format(
                                    "Type = %s, Description = %s",
                                    aClass.getAnnotation(CustomAnnotation.class).type(),
                                    aClass.getAnnotation(CustomAnnotation.class).description()
                            )
                    );
                }
            }
        }
    }
    
}
