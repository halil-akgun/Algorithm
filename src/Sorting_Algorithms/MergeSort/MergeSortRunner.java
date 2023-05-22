package Sorting_Algorithms.MergeSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {

        int[] arr = {5, 37, 43, 12, 3, 28, 4, 2, 33, 0, 9, 6, 7, 50, 1, 8, 13, 19, 15, 24};

        System.out.println("MSort oncesi Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("*******************");

        System.out.println("MSort Sonrasi Array :");
        MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}