package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.implementations;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService{

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        System.out.println("send Email");
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
