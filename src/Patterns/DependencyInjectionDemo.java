package Patterns;

// Usage
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        NotificationService notificationService = DIContainer.getNotificationService();
        notificationService.sendNotification("Hello, DI!", "user@example.com");
    }
}