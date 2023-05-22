import Sorting_Algorithms.BubbleSort.BubbleSort;
import Sorting_Algorithms.InsertionSort.InsertionSort;
import Sorting_Algorithms.MergeSort.MergeSort;
import Sorting_Algorithms.QuickSort.QuickSort;
import Sorting_Algorithms.SelectionSort.SelectionSort;
import Sorting_Algorithms.ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {

    public static void main(String[] args) {

        int[] arr = createArray(300000);
//        int[] arr = createOrderedArray(3000);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        int[] arr6 = Arrays.copyOf(arr, arr.length);
        int[] arr7 = Arrays.copyOf(arr, arr.length);

        long startTime;
        long endTime;
        double estimatedTime;

        //InsertionSort
//        startTime = System.currentTimeMillis();
//        InsertionSort.insertionSort(arr);
//        endTime = System.currentTimeMillis();
//
//        estimatedTime = (double) (endTime - startTime) / 1000;
//        System.out.println("InsertionSort : " + estimatedTime);


//        SelectionSort
//        startTime = System.currentTimeMillis();
//        SelectionSort.selectionSort(arr2);
//        endTime = System.currentTimeMillis();
//
//        estimatedTime = (double) (endTime - startTime) / 1000;
//        System.out.println("SelectionSort : " + estimatedTime);

//
////        BubbleSort
//        startTime = System.currentTimeMillis();
//        BubbleSort.bubleSort(arr3);
//        endTime = System.currentTimeMillis();
//
//        estimatedTime = (double) (endTime - startTime) / 1000;
//        System.out.println("BubbleSort : " + estimatedTime);


//        //MergeSort
        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(arr4);
        endTime = System.currentTimeMillis();

        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("MergeSort : " + estimatedTime);


        //QuickSort
        startTime = System.currentTimeMillis();
        QuickSort.quickSort(arr5);
        endTime = System.currentTimeMillis();

        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("QuickSort : " + estimatedTime);


        //ShellSort
        startTime = System.currentTimeMillis();
        ShellSort.shellSort(arr6);
        endTime = System.currentTimeMillis();

        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("ShellSort : " + estimatedTime);

//
//        //ArraysSort
        startTime = System.currentTimeMillis();
        Arrays.sort(arr7);
        endTime = System.currentTimeMillis();

        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("ArraysSort : " + estimatedTime);
//

    }

    // random array donduren method
    public static int[] createArray(int elemanSayisi) {

        int[] arr = new int[elemanSayisi];
        Random rm = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rm.nextInt(10000);

        }

        return arr;

    }


    // sirali array donduren method
    public static int[] createOrderedArray(int elemanSayisi) {

        int[] arr = new int[elemanSayisi];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }

        return arr;

    }
}