package LeetCode.MergeSortedArray;

public class MergeSortedArray {
    /**
     * 这个代码一坨解决了问题的shit
     * 我的错，我写的还挺好的，是看起来像shit的巧克力
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length;
        while (n != 0) {
            if (m == 0) {
                for (int j = 0; j < n; j++) {
                    nums1[j] = nums2[j];
                }
                break;
            }

            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[length - 1] = nums1[m - 1];
                m--;
                length--;
            }
            if (m == 0) {
                continue;
            }
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[length - 1] = nums2[n - 1];
                length--;
                n--;
            }
        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

}
