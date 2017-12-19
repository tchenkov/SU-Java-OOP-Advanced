package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Executor;

public class CommandExecutor implements Executor {
    public CommandExecutor() {
    }
    
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
