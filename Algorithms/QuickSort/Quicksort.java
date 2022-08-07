package Algorithms.QuickSort;

import static Algorithms.SortUtils.swap;

public class Quicksort {
    private int length;
    private int[] temp;

    public Quicksort(int[] data) {
        int partitionIndex = partition(data, 0, data.length);
        new Quicksort(data, 0, partitionIndex - 1);
        new Quicksort(data, partitionIndex + 1, data.length);

    }

    //该函数用于确认分割位置，其内部会交换数组数据，使得分割位置为中间位置。
    public int partition(int[] data, int left, int right) {

        int temp = data[right-1];
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (leftIndex < right && data[leftIndex] <= temp) {
                leftIndex++;
            }
            while (rightIndex >= left && data[rightIndex] > temp) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) {
                break;
            }
            swap(data, leftIndex, rightIndex);
        }
        swap(data, leftIndex, rightIndex);
        return leftIndex;
    }

    //该函数用于排序
    public Quicksort(int[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        int partitionIndex = partition(data, left, right);
        new Quicksort(data, left, partitionIndex - 1);
        new Quicksort(data, partitionIndex + 1, right);
    }


}
