package Algorithms.BubbleSort;

public class BubbleSort {

    private int length;
    private int temp;

    private boolean sorted;

    public BubbleSort(int[] data) {
        length = data.length;
        for (int i = 0; i < length - 1; i++) {
            sorted = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }

    }

    public void swap(int[] data, int index_1, int index_2) {
        temp = data[index_1];
        data[index_1] = data[index_2];
        data[index_2] = temp;
    }
}
