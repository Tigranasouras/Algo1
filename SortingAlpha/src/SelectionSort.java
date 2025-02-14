class SelectionSort implements AlphaSort{
    public int[] sorter(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  //Assumption: first element is the min

            //Find the index of the smallest element in the unsorted section remaining
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        return data;
    }
}

