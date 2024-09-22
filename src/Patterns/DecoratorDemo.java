package Patterns;

// Usage
public class DecoratorDemo {
    public static void main(String[] args) {
        Logger logger = new TimestampDecorator(new EncryptionDecorator(new BasicLogger()));
        logger.log("This is a test message");
    }
}