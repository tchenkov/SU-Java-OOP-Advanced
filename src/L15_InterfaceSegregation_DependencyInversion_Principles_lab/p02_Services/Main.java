package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.OnlineStoreOrder;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.implementations.EmailNotificationService;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.implementations.SmsNotificationService;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p02_Services.core.interfaces.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService1 = new EmailNotificationService(true);
        NotificationService notificationService2 = new SmsNotificationService(true);
        NotificationService notificationService3 = new SmsNotificationService(false);
        NotificationService notificationService4 = new EmailNotificationService(false);
    
        NotificationService[] notificationServices = new NotificationService[]
                {
                        notificationService1,
                        notificationService2,
                        notificationService3,
                        notificationService4
                };
        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(notificationServices);
        onlineStoreOrder.process();
    }
}
