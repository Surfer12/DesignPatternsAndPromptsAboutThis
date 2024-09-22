public abstract class PaymentProcessorFactory {
    public abstract PaymentProcessor createProcessor();

    public void processPayment(double amount) {
        PaymentProcessor processor = createProcessor();
        if (processor != null) {
            processor.processPayment(amount);
        } else {
            throw new UnsupportedOperationException("Payment method not supported.");
        }
    }
}

// Existing Payment Processors
// ... existing code ...

// New Payment Processor Example (Addition)
public class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}

public class CryptoProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CryptoProcessor();
    }
}

// Usage Example with Error Handling
public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<PaymentProcessorFactory> factories = Arrays.asList(
                new CreditCardProcessorFactory(),
                new PayPalProcessorFactory(),
                new CryptoProcessorFactory()
        );

        double[] payments = {100.00, 50.00, 200.00};

        IntStream.range(0, factories.size()).forEach(i -> {
            try {
                factories.get(i).processPayment(payments[i]);
            } catch (UnsupportedOperationException e) {
                System.err.println(e.getMessage());
            }
        });
    }
}