class BubbleSort implements AlphaSort {
    public int[] sorter(int[] data) {
        int n = data.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    //Swap data[j] and data[j+1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            //if already sorted --> no swapping
            if (!swapped) break;
        }
        return data;
    }
}
