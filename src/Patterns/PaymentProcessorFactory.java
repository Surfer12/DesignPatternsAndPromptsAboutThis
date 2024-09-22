package Patterns;

public abstract class PaymentProcessorFactory {
    public abstract PaymentProcessor createProcessor();

    public void processPayment(double amount) {
        PaymentProcessor processor = createProcessor();
        processor.processPayment(amount);
    }
}