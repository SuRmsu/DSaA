package LeetCode;

import LeetCode.RotateArray.RotateArray;
import LeetCode.Shift2DGrid.Shift2DGrid;
import LeetCode.ValidMountainArray.ValidMountainArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] data=  {
                0,1,2,1,2
        };
        ValidMountainArray a = new ValidMountainArray();

        System.out.println(a.validMountainArray(data));
    }

}
