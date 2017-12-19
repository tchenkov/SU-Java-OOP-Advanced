package L17_ObjectCommunicationAndEvents_lab.P04_Observer.executor;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Executor;

public class CommandExecutor implements Executor {
    public CommandExecutor() {
    }
    
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
