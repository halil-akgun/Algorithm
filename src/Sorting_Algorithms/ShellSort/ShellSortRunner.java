package Sorting_Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {

    public static void main(String[] args) {

        int[] arr = {5, 37, 43, 12, 3, 28, 4, 2, 33, 0};

        System.out.println("SSort oncesi Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("*******************");

        System.out.println("SSort Sonrasi Array :");
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}