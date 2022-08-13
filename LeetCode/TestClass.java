package LeetCode;

import LeetCode.RotateArray.RotateArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] data= new int[] {
            1,2,3,4,5
        };
        RotateArray a = new RotateArray();
                a.rotate2(data,4);
        System.out.println(Arrays.toString(data));
    }

}
