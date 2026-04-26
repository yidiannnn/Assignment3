public class Main {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment exp = new Experiment();

        int[] small = sorter.generateRandomArray(10);
        int[] medium = sorter.generateRandomArray(100);
        int[] large = sorter.generateRandomArray(1000);

        System.out.println("=== SMALL (10) ===");
        System.out.println("Basic: " + exp.measureSortTime(small.clone(), "basic", sorter));
        System.out.println("Advanced: " + exp.measureSortTime(small.clone(), "advanced", sorter));
        System.out.println("Search: " + exp.measureSearchTime(small, small[5], searcher));

        System.out.println("=== MEDIUM (100) ===");
        System.out.println("Basic: " + exp.measureSortTime(medium.clone(), "basic", sorter));
        System.out.println("Advanced: " + exp.measureSortTime(medium.clone(), "advanced", sorter));
        System.out.println("Search: " + exp.measureSearchTime(medium, medium[50], searcher));

        System.out.println("=== LARGE (1000) ===");
        System.out.println("Basic: " + exp.measureSortTime(large.clone(), "basic", sorter));
        System.out.println("Advanced: " + exp.measureSortTime(large.clone(), "advanced", sorter));
        System.out.println("Search: " + exp.measureSearchTime(large, large[500], searcher));
    }
}