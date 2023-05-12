package Sorting_Algorithms.BubleSort;

import java.util.Arrays;

public class BubleSortRunner {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9, 6, 3, 4};

        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        BubleSort.bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
