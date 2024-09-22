package Patterns;

public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public <T extends Comparable<T>> void sort(List<T> list) {
        if (strategy == null) {
            throw new IllegalStateException("Sort strategy not set");
        }
        strategy.sort(list);
    }
}