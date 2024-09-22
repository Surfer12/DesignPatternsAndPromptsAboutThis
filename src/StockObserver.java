/**
 * Observer Pattern implementation for a stock price monitoring system
 */
public interface StockObserver {
    void update(String stock, double price);
}

public class StockTrader implements StockObserver {
    private String name;

    public StockTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " notified. " + stock + " price: $" + price);
    }
}
