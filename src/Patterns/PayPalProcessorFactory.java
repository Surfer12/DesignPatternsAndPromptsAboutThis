package Patterns;

public class PayPalProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}