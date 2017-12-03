package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.engine;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.annotations.Inject;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.core.Executable;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.InputReader;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.OutputWriter;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories.Repository;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Engine implements Runnable{
    private static final String TERMINATE_COMMAND = "END";
    private static final String COMMAND_CLASS_PATH =
            Executable.class.getCanonicalName().replace(Executable.class.getSimpleName(), "commands.");
    private static final String COMMAND_CLASS_NAME_SUFFIX = "Command";//Executable.class.getSimpleName();
    
    
    private String[] params;
    private Repository<Weapon> weaponRepository;
    private InputReader br;
    private OutputWriter writer;
    
    
    public Engine(Repository<Weapon> weaponRepository, InputReader br, OutputWriter writer) {
        this.weaponRepository = weaponRepository;
        this.br = br;
        this.writer = writer;
    }
    
    @Override
    public void run() {
        while (true){
            this.params = this.br.readLine().split(";");
            if (TERMINATE_COMMAND.equals(this.params[0])){
                break;
            }
            try {
                String result = this.dispatchCommand(this.params[0], Arrays.stream(this.params).skip(1).toArray(String[]::new));
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
    private String dispatchCommand(String command, String[] tokens) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        this.params = tokens;
        Class<Executable> commandClass =
                (Class<Executable>) Class.forName(COMMAND_CLASS_PATH + command + COMMAND_CLASS_NAME_SUFFIX);
        Constructor<Executable> declaredConstructor = commandClass.getDeclaredConstructor();
        Executable executable = declaredConstructor.newInstance();
        injectDependencies(executable);
        return executable.execute();
    }
    
    private void injectDependencies(Executable executable) throws IllegalAccessException {
        Field[] fields = executable.getClass().getSuperclass().getDeclaredFields();
    
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)){
                Field[] currentFields = this.getClass().getDeclaredFields();
                for (Field currentField : currentFields) {
                    if (field.getType().equals(currentField.getType())){
                        field.setAccessible(true);
                        field.set(executable, currentField.get(this));
                    }
                }
            }
        }
    }
}
