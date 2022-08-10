package Algorithms.MergeSort;

import Algorithms.BubbleSort.BubbleSort;
import Algorithms.QuickSort.QuickSort;
import Algorithms.SortUtils;

public class MergeSort {

    /**
     *
     */
    public MergeSort(int[] data) {
        int length = data.length;
        int mid = length / 2;
        new MergeSort(data, 0, mid);
        new MergeSort(data, mid + 1, length);
        Merge(data, 0, mid, length);
    }

    public MergeSort(int[] data, int start, int end) {
        if (end - start < 1) {
            return;
        }
        int mid = (end + start) / 2;
        new MergeSort(data, start, mid);
        new MergeSort(data, mid + 1, end);
        Merge(data, start, mid,end);


    }

    public void Merge(int[] data, int start,int mid, int end) {
        new QuickSort(data, start, end - 1);
    }
}
