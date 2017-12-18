package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.interfaces.NotificationService;

public class OnlineStoreOrder {

    private NotificationService[] notificationServices;

    public OnlineStoreOrder(NotificationService[] notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void process() {
        for (NotificationService notificationService : this.notificationServices) {
            if (notificationService.isActive())
                notificationService.sendNotification();
        }
    }
}
