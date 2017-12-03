package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.commands;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.annotations.CustomAnnotation;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.BaseCommand;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations.BaseWeapon;

public class AuthorCommand extends BaseCommand {
    @Override
    public String execute() {
        CustomAnnotation annotation = BaseWeapon.class.getAnnotation(CustomAnnotation.class);
        if (annotation != null) {
            return String.format(
                    "Author: %s",
                    annotation.author()
            );
        }
        return null;
    }
}
