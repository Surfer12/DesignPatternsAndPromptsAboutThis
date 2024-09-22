package Patterns;

/**
 * Factory Method Pattern implementation for creating payment processors
 */
public interface PaymentProcessor {
    void processPayment(double amount);
}