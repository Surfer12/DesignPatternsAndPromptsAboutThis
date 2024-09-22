package Patterns;

// Usage
public class FactoryMethodDemo {
    public static void main(String[] args) {
        PaymentProcessorFactory factory = new CreditCardProcessorFactory();
        factory.processPayment(100.00);

        factory = new PayPalProcessorFactory();
        factory.processPayment(50.00);
    }
}