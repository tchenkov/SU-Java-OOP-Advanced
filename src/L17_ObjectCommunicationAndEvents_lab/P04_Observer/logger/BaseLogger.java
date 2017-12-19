package L17_ObjectCommunicationAndEvents_lab.P04_Observer.logger;

import L17_ObjectCommunicationAndEvents_lab.P04_Observer.interefaces.Handler;

public abstract class BaseLogger implements Handler {
    private Handler successor;
    
    BaseLogger() {
    }
    
    protected Handler getSuccessor() {
        return this.successor;
    }
    
    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
}
