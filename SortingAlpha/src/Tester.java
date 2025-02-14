import java.util.Random;

class Tester {
    private AlphaSort sortingAlgorithm;

    public Tester(AlphaSort yuh) {
        this.sortingAlgorithm = yuh;
    }

    //Runs a single test with a randomly generated array of given size
    public double singleTest(int size) {
        int[] data = generateRandomArray(size);
        long startTime = System.nanoTime(); //Start time
        sortingAlgorithm.sorter(data); //Sort the array
        long endTime = System.nanoTime(); //End time
        return (endTime - startTime);
    }

    //Runs multiple tests and calculates average sorting time
    public void test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        double averageTime = totalTime / iterations;
        System.out.println(sortingAlgorithm.getClass().getSimpleName() +
                " sorted " + size + " elements in " +
                averageTime + " ms on average.");
    }

    //Helper function to generate a random array
    private int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(10000); //Random between 0-9999
        }
        return data;
    }
}