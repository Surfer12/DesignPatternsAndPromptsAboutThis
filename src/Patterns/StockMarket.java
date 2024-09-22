package Patterns;

import java.util.ArrayList;
import java.util.List;

import StockObserver;

public class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();
    private String stockSymbol;
    private double price;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
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
        for (StockObserver observer : observers) {
            observer.update(stockSymbol, price);
        }
    }
}