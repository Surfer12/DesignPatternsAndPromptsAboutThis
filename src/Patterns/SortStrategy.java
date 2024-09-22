import java.util.List;

/**
 * Strategy Pattern implementation for sorting algorithms
 */
public interface SortStrategy {
    <T extends Comparable<T>> void sort(List<T> list);
}

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        // Bubble sort implementation
        System.out.println("Sorting using Bubble Sort");
        // ... (implementation details omitted for brevity)
    }
}
