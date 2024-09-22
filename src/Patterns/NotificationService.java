package Patterns;

public class NotificationService {
    private MessageService messageService;

    // Constructor injection
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }
}