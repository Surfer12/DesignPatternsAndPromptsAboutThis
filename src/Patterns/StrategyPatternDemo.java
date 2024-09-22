package Patterns;

// Usage
public class StrategyPatternDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9);
        Sorter sorter = new Sorter();

        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sort(numbers);

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sort(numbers);
    }
}