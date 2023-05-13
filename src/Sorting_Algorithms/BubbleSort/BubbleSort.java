package Sorting_Algorithms.BubbleSort;

public class BubbleSort {

    public static void bubleSort(int[] arr) {

        boolean swapped;
        int temp;

        do {
            swapped = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
