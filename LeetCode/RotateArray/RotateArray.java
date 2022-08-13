package LeetCode.RotateArray;

import static Algorithms.SortUtils.swap;

public class RotateArray {
    /**
     * 解法1，暴力解法 待优化
     * @param nums
     * @param k
     */
    public void rotate(int[] nums,int k){

        int[] data = nums.clone();
        int length = nums.length;
        int t = k % length;
        int i = 0;
        for (; i - t < 0; i++) {
            nums[i] = data[i + length - t];
        }
        for(;i<length;i++){
            nums[i] = data[i - t];
        }

    }

    public void rotate2(int[] nums, int k){
        int length = nums.length;
        for (int i = 0; i < length / 2; i++) {
            swap(nums, i, length - i - 1);
        }
        int times = k % length;
        for (int i = 0; i < (times - 1)/2; i++) {
            swap(nums,i,length - i - 1);
        }
        for (int i = times; i < times + length / 2; i++) {
            swap(nums,i,length + times - i - 1);
        }
    }
}
