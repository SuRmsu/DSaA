package LeetCode.Shift2DGrid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static Algorithms.SortUtils.swap;

public class Shift2DGrid {
    /**
     * 第一种方法，切割为单维数组后进行循环
     * @param grid
     * @param k
     * @return
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] temp = new int[grid.length * grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                temp[grid[0].length*i+j] = grid[i][j];
            }
        }
        int length = temp.length;

        k = k % length;

        for (int i = 0; i < length / 2; i++) {
            swap(temp,i,length - i - 1);

        }
        for(int i = 0; i < k /2 ; i++) {
            swap(temp,i,k - i -1);
        }
        for (int i = k; i < (length + k)/2; i++) {
            swap(temp, i, length + k - i - 1);
        }

        System.out.println(Arrays.toString(temp));
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0; i < grid.length; i++){
            list.add(new LinkedList<>());
        }
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                list.get(i).add(temp[i*grid[0].length + j]);
            }
        }

        return list;

    }
    public void swap(int[] data, int index_1, int index_2) {
        int temp = data[index_1];
        data[index_1] = data[index_2];
        data[index_2] = temp;
    }

}
