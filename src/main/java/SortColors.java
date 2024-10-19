class SortColors {
    public void sortColors(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        while (mid <= end) {
            if (array[mid] == 0) {
                swap(array, start, mid);
                start++;
                mid++;
            } else if (array[mid] == 2) {
                swap(array, mid, end);
                end--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[]{2, 1, 0});
    }
}
