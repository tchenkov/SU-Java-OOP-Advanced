package L10_Reflection_Exercises.P01_HarvestingFields.engine;


import L10_Reflection_Exercises.P01_HarvestingFields.core.Executable;
import L10_Reflection_Exercises.P01_HarvestingFields.io.InputReader;
import L10_Reflection_Exercises.P01_HarvestingFields.io.OutputWriter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("Duplicates")
public class Engine implements Runnable{
    private static final String TERMINATE_COMMAND = "HARVEST";
    private static final String COMMAND_CLASS_PATH =
            Executable.class.getCanonicalName().replace(Executable.class.getSimpleName(), "commands.");
    private static final String COMMAND_CLASS_NAME_SUFFIX = "Command";
    
    
    private String param;
    private InputReader br;
    private OutputWriter writer;
    
    
    public Engine(InputReader br, OutputWriter writer) {
        this.br = br;
        this.writer = writer;
    }
    
    @Override
    public void run() {
        while (true){
            this.param = br.readLine();
            if (TERMINATE_COMMAND.equals(this.param)){
                break;
            }
            try {
                String result = this.dispatchCommand(this.param);
                if (result != null){
                    this.writer.writeLine(result);
                }
            }
            catch (ClassNotFoundException | InstantiationException |
                    IllegalAccessException | NoSuchMethodException |
                    InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    private String dispatchCommand(String command) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        
        Class<Executable> commandClass =
                (Class<Executable>) Class.forName(COMMAND_CLASS_PATH + formatCommand(command) + COMMAND_CLASS_NAME_SUFFIX);
        Constructor<Executable> declaredConstructor = commandClass.getDeclaredConstructor();
        Executable executable = declaredConstructor.newInstance();
        //injectDependencies(executable);
        return executable.execute();
    }
    
    private String formatCommand(String command) {
        command = command.toUpperCase().charAt(0) + command.toLowerCase().substring(1);
        return command;
    }

//    private void injectDependencies(Executable executable) throws IllegalAccessException {
//        Field[] fields = executable.getClass().getSuperclass().getDeclaredFields();
//
//        for (Field field : fields) {
//            if (field.isAnnotationPresent(Inject.class)){
//                Field[] currentFields = this.getClass().getDeclaredFields();
//                for (Field currentField : currentFields) {
//                    if (field.getType().equals(currentField.getType())){
//                        field.setAccessible(true);
//                        field.set(executable, currentField.get(this));
//                    }
//                }
//            }
//        }
//    }
}
