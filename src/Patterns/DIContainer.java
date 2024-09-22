package Patterns;

// Simple DI container
public class DIContainer {
    public static NotificationService getNotificationService() {
        // Here we're deciding which implementation to inject
        return new NotificationService(new EmailService());
    }
}