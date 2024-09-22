package Patterns;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        // Quick sort implementation
        System.out.println("Sorting using Quick Sort");
        // ... (implementation details omitted for brevity)
    }
}