package Algorithms.QuickSort;

import static Algorithms.SortUtils.swap;

public class Quicksort {
    private int length;
    private int[] temp;

    public Quicksort(int[] data) {
        int partitionIndex = partition(data, 0, data.length - 1);
        new Quicksort(data, 0, partitionIndex - 1);
        new Quicksort(data, partitionIndex + 1, data.length - 1);

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

    //该函数用于确认分割位置，其内部会交换数组数据，使得分割位置为中间位置。
    public int partition(int[] data, int left, int right) {

        int temp = data[right];
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
                break;//运行到此处表示已经排完序，此时rightIndex指向leftIndex左边一个位置
            }
            swap(data, leftIndex, rightIndex);
        }
        swap(data, leftIndex, right);

        return leftIndex;
    }


}
