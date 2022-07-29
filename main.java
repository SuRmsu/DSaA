import Algorithms.InsertionSort.InsertionSort;

import java.util.Arrays;


public class main {
    public static void main(String[] args){
        int[] temp = new int[]{3,2,5,6,8,3,4};

        System.out.println("this is test");
        System.out.println(Arrays.toString(temp));
        InsertionSort a =new InsertionSort(temp);
        System.out.println(Arrays.toString(temp));

    }
    
}
