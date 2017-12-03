package L08_EnumerationsAndAnnotations_Exercises.P06_CustomEnumAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String type();
    String category();
    String description();
}
