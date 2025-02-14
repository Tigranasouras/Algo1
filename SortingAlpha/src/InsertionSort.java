class InsertionSort implements AlphaSort{
    public int[] sorter(int[] data) {
        int n = data.length;

        for (int i = 1; i < n; i++) {
            int key = data[i];  //The element to be inserted
            int j = i - 1;

            //Move elements that are greater than `key` one position ahead
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            //Insert `key` at the correct position
            data[j + 1] = key;
        }

        return data;
    }
}

