class QuickSort implements AlphaSort{
    public int[] sorter(int[] data) { //Using zybook
        quickSort(data, 0, data.length - 1);
        return data;
    }

    private void quickSort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            //Partition the array and get the pivot index
            int pivotIndex = partition(numbers, lowIndex, highIndex);

            //Recursively sort elements before and after partition
            quickSort(numbers, lowIndex, pivotIndex);
            quickSort(numbers, pivotIndex + 1, highIndex);
        }
    }

    private int partition(int[] numbers, int lowIndex, int highIndex) {
        //Pick the middle element as pivot
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = numbers[midpoint];

        boolean done = false;
        while (!done) {
            //Move lowIndex forward if the element is smaller than the pivot
            while (numbers[lowIndex] < pivot) {
                lowIndex++;
            }

            //Move highIndex backward if the element is greater than the pivot
            while (pivot < numbers[highIndex]) {
                highIndex--;
            }

            //Check if partitioning is done
            if (lowIndex >= highIndex) {
                done = true;
            } else {
                //Swap numbers[lowIndex] and numbers[highIndex]
                int temp = numbers[lowIndex];
                numbers[lowIndex] = numbers[highIndex];
                numbers[highIndex] = temp;

                //Move indices toward the center
                lowIndex++;
                highIndex--;
            }
        }
        return highIndex; //Return partition index
    }
}

