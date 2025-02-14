public class Main {
    public static void main(String[] args) {
        int[] data = {74, 24, 215, 45654, 234, 13, 35, -5};

        AlphaSort sorter = new QuickSort(); // Change this to any sorting algorithm
        int[] sortedArray = sorter.sorter(data);

        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
