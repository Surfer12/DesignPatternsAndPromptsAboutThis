package Patterns;

import StockTrader;

// Usage
public class ObserverDemo {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addObserver(new StockTrader("Trader 1"));
        market.addObserver(new StockTrader("Trader 2"));

        market.setStockPrice("AAPL", 150.00);
        market.setStockPrice("GOOGL", 2800.00);
    }
}