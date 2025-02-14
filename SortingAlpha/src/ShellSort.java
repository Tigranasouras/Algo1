class ShellSort implements AlphaSort{
    public int[] sorter(int[] data) {
        int n = data.length;

        //Start with a large gap, then reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) { //this was a pain to figure out, I felt so dumb
            for (int i = gap; i < n; i++) { //Perform insertion sort on elements using gap
                int temp = data[i];
                int j = i;

                //Shift elements of the current gap interval to find correct position
                while (j >= gap && data[j - gap] > temp) {
                    data[j] = data[j - gap];
                    j -= gap;
                }

                //Place temp at its correct position
                data[j] = temp;
            }
        }
        return data;
    }
}

