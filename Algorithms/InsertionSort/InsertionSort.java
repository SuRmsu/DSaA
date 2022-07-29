package Algorithms.InsertionSort;

public class InsertionSort {
    private int length;
    private int temp;

    /**
     * Insertion Sort
     * Ihe idea was from MIT, 核心科技看美帝
     * @param data the array which needs to be sorted
     */
    public InsertionSort(int[] data) {

        length = data.length;
        for (int i = 1; i < length; i++) {
            temp = data[i];
            int j;
            for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                data[j + 1] = data[j];
            }
            if (j != i - 1) {
                data[j + 1] = temp;
            }
        }


    }

    public void swap(int[] data, int index_1, int index_2) {
        temp = data[index_1];
        data[index_1] = data[index_2];
        data[index_2] = temp;
    }
}