package Patterns;

public abstract class LoggerDecorator implements Logger {
    protected Logger wrappedLogger;

    public LoggerDecorator(Logger logger) {
        this.wrappedLogger = logger;
    }

    @Override
    public void log(String message) {
        wrappedLogger.log(message);
    }
}