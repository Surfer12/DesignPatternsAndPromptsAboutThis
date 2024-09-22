package Patterns;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }
}