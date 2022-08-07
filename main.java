import Algorithms.BubbleSort.BubbleSort;
import Algorithms.InsertionSort.InsertionSort;
import Algorithms.QuickSort.Quicksort;
import TestData.TestData;
import java.util.Arrays;


public class main {
    public static void main(String[] args){
        var temp = TestData.testDataInt;

        System.out.println("this is test");
        System.out.println(Arrays.toString(temp));
        long startTime=System.nanoTime();

        Quicksort a = new Quicksort(temp);
        //BubbleSort a =new BubbleSort(temp);
        //InsertionSort a = new InsertionSort(temp);


        long endTime=System.nanoTime();
        System.out.println(Arrays.toString(temp));

        /*
        TestData b = new TestData();
        System.out.println(Arrays.toString(TestData.testDataInt));
        System.out.println(Arrays.toString(b.testDataInt));
        */
        System.out.println("程序运行时间： " + (endTime - startTime) + "ns");

    }

    
}
