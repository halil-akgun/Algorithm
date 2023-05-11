package Sorting_Algorithms.InsertionSort;


import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9, 6, 3, 4};

        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
