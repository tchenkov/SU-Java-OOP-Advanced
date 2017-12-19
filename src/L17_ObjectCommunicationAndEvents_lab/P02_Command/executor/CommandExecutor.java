package L17_ObjectCommunicationAndEvents_lab.P02_Command.executor;

import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P02_Command.interefaces.Executor;

public class CommandExecutor implements Executor {
    public CommandExecutor() {
    }
    
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
