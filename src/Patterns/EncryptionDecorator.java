package Patterns;

public class EncryptionDecorator extends LoggerDecorator {
    public EncryptionDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String encryptedMessage = encrypt(message);
        super.log(encryptedMessage);
    }

    private String encrypt(String message) {
        // Simple encryption for demonstration
        return "ENCRYPTED[" + message + "]";
    }
}