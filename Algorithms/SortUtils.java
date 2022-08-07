package Algorithms;

public class SortUtils {
    public static void swap(int[] data, int index_1, int index_2) {
        int temp = data[index_1];
        data[index_1] = data[index_2];
        data[index_2] = temp;
    }
}
