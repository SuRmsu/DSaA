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

    //该方法未能理解，需要进一步了解
    public void rotate1(int[] nums, int k ){
        int n = nums.length;
        k = k % n;
        int count = gcd(k,n);
        for (int start = 0; start < count; ++start){
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }
    }
    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public void rotate2(int[] nums, int k){
        k %= nums.length;
        reverse(nums, 0,nums.length -1);
        reverse(nums, 0,k-1);
        reverse(nums,k,nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end) {
            swap(nums,start,end);
            start += 1;
            end -= 1;
        }
    }
}
