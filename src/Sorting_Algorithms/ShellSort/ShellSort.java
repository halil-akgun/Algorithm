package Sorting_Algorithms.ShellSort;

public class ShellSort {

    public static void shellSort(int[] a) {

        int temp;
        int moveItem;

        for (int gap = a.length / 2; gap > 0; gap /= 2) { // gap = gap/2

            for (int next = gap; next < a.length; next++) {
                temp = a[next];
                moveItem = next;
                while (moveItem >= gap && temp < a[moveItem - gap]) {
                    a[moveItem] = a[moveItem - gap];
                    moveItem = moveItem - gap;
                }
                a[moveItem] = temp;
            }
        }
    }
}