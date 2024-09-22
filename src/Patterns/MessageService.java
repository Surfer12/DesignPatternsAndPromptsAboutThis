package Patterns;

/**
 * Dependency Injection Pattern implementation
 */
public interface MessageService {
    void sendMessage(String message, String receiver);
}