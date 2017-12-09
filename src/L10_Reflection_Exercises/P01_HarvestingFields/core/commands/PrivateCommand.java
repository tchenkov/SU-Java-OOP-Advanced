package L10_Reflection_Exercises.P01_HarvestingFields.core.commands;

import L10_Reflection_Exercises.P01_HarvestingFields.RichSoilLand;
import L10_Reflection_Exercises.P01_HarvestingFields.core.BaseCommand;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrivateCommand extends BaseCommand {
    @Override
    public String execute() {
        Class targetClass = RichSoilLand.class;
        Field[] fields = targetClass.getDeclaredFields();
        final StringBuilder output = new StringBuilder();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers())){
                output.append(
                        String.format(
                                //"<access modifier> <field type> <field name>"
                                "%s %s %s",
                                Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(),
                                field.getName()
                        )
                ).append(System.lineSeparator());
            }
        }
        
        return output.length() != 0 ?
                output.toString().trim() :
                null;
    }
}
