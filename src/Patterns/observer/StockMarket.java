import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Class representing a stock market that notifies observers of price changes.
 */
public class StockMarket {
    private final List<StockObserver> observers = new CopyOnWriteArrayList<>();
    private final ExecutorService notificationExecutor = Executors.newCachedThreadPool();
    private String stockSymbol;
    private double price;

    public void addObserver(StockObserver observer) {
        if (observer != null) {
            observers.add(observer);
        } else {
            throw new IllegalArgumentException("Observer cannot be null.");
        }
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setStockPrice(String symbol, double price) {
        this.stockSymbol = symbol;
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer ->
                notificationExecutor.submit(() -> observer.update(stockSymbol, price))
        );
    }

    public void shutdown() {
        notificationExecutor.shutdown();
    }
}