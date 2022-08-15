package LeetCode.ValidMountainArray;

public class ValidMountainArray {
    /**
     * 方法1是我写过的最垃圾的代码，没有之一
     *
     * @param arr
     * @return
     */
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if (length > 2) {
            if (arr[0] > arr[1]) {
                return false;
            }
            int i = 0;
            int temp = 0;
            int temptemp = 0;
            while (i < length - 1) {
                if (arr[i] > arr[i + 1]) {

                    while (i < length - 1) {
                        if (temptemp == 0 && (i + 1 == length - 1)) {
                            return true;
                        }
                        if (arr[i] <= arr[i + 1]) {
                            return false;
                        }
                        i++;
                        temptemp++;
                    }
                    temp = 1;
                }
                if (temp == 1) {
                    return true;
                }
                if (i == length - 1) {
                    break;
                }
                if (arr[i] == arr[i + 1]) {
                    break;
                }
                i++;

            }
            if (i >= length) {
                return true;
            }
        }

        return false;
    }

    /**
     * 官方方法，思想是相同的，但是解决了很多问题
     * @param arr
     * @return
     */
    public boolean validMountainArray1(int[] arr) {

        int N = arr.length;
        int i = 0;

        // 递增扫描
        while (i + 1 < N && arr[i] < arr[i + 1]) {
            i++;
        }

        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == N - 1) {
            return false;
        }

        // 递减扫描
        while (i + 1 < N && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == N - 1;


    }
}
