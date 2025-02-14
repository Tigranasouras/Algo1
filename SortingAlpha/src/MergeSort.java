class MergeSort implements AlphaSort{
    public int[] sorter(int[] data) { // Using zybook implementation
        mergeSort(data, 0, data.length - 1);
        return data;
    }

    private void mergeSort(int[] numbers, int leftFirst, int rightLast) {
        if (leftFirst < rightLast) {
            int leftLast = leftFirst + (rightLast - leftFirst) / 2; //Find middle point

            //Recursively sort first and second halves
            mergeSort(numbers, leftFirst, leftLast);
            mergeSort(numbers, leftLast + 1, rightLast);

            //Merge the sorted halves
            merge(numbers, leftFirst, leftLast, rightLast);
        }
    }

    private void merge(int[] numbers, int leftFirst, int leftLast, int rightLast) {
        int mergedSize = rightLast - leftFirst + 1; //Size of merged partition
        int[] mergedNumbers = new int[mergedSize]; //Temp array
        int leftPos = leftFirst;  //Position for left subarray
        int rightPos = leftLast + 1; //Position for right subarray
        int mergePos = 0; //Position for merged array

        //Merge two sorted subarrays into temp array
        while (leftPos <= leftLast && rightPos <= rightLast) {
            if (numbers[leftPos] <= numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                leftPos++;
            } else {
                mergedNumbers[mergePos] = numbers[rightPos];
                rightPos++;
            }
            mergePos++;
        }

        //If left partition still has elements, add them
        while (leftPos <= leftLast) {
            mergedNumbers[mergePos] = numbers[leftPos];
            leftPos++;
            mergePos++;
        }

        //If right partition still has elements, add them
        while (rightPos <= rightLast) {
            mergedNumbers[mergePos] = numbers[rightPos];
            rightPos++;
            mergePos++;
        }

        //Copy merged elements back into original array
        for (mergePos = 0; mergePos < mergedSize; mergePos++) {
            numbers[leftFirst + mergePos] = mergedNumbers[mergePos];
        }
    }
}

