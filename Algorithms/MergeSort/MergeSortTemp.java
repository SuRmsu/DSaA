package Algorithms.MergeSort;

import Algorithms.QuickSort.QuickSort;

import static Algorithms.SortUtils.copy;

public class MergeSortTemp {
    public MergeSortTemp(int[] data) {
        int[] temp = copy(data);
        new MergeSortTemp(data, temp,0,data.length - 1);


    }

    public MergeSortTemp(int[] data,int[] temp,int start,int end){
        if (end - start < 1) {
            return;
        }
        int mid = (end + start) / 2;
        new MergeSortTemp(data,temp,start,mid);
        new MergeSortTemp(data,temp,mid+1,end);
        Merge(data, temp,start, mid,end);
    }

    public void Merge(int[] data,int[] temp,int start,int mid,int end) {
       // new QuickSort(data,start,end);
       for(int i = start; i <= end; i++) {
           temp[i] = data[i];
       }
       int leftStart = start;
       int rightStart = mid + 1;
       for (int i = start; i <= end; i++) {
           if (leftStart > mid) {
               data[i] = temp[rightStart++];
           } else if (rightStart > end) {
               data[i] = temp[leftStart++];
           } else if (temp[leftStart] < temp[rightStart]) {
               data[i] = temp[leftStart++];
           } else {
               data[i] = temp[rightStart++];
           }
       }
    }
}
