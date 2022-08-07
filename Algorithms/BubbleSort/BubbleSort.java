package Algorithms.BubbleSort;

import Algorithms.SortUtils;

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
                    SortUtils.swap(data, j, j + 1);
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }

    }


    }


