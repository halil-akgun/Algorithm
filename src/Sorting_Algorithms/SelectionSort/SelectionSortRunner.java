package Sorting_Algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9, 6, 3, 4};

        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
