package Patterns;

public class TimestampDecorator extends LoggerDecorator {
    public TimestampDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String timestampedMessage = String.format("[%tF %<tT] %s", System.currentTimeMillis(), message);
        super.log(timestampedMessage);
    }
}