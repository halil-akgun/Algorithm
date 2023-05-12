package Sorting_Algorithms.QuickSort;

import java.util.Arrays;

public class QuickSortRunner {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9, 6, 3, 4};
        int[] arr2 = {1, 2, 5, 9, 100, 77, 66, 853, 971, 1099, 21, -5, 6, 3, 4};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("******************");

        QuickSort.quickSort(arr);
        QuickSort.quickSort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}