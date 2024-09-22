package Patterns;

public class CreditCardProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}