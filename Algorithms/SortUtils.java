package Algorithms;

public class SortUtils {
    public static void swap(int[] data, int index_1, int index_2) {
        int temp = data[index_1];
        data[index_1] = data[index_2];
        data[index_2] = temp;
    }
    public static int[] copy(int[] data) {
        int[] newData = new int[data.length];
        for (int i = 0; i <data.length; i++) {
            newData[i] = data[i];
        }
        return newData;
    }
}
