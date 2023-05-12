package Sorting_Algorithms.QuickSort;

public class QuickSort {

    public static void quickSort(int[] arr) {

        QuickSort quickSort = new QuickSort();
        quickSort.quickSortRun(arr, 0, arr.length - 1);

    }

    // ana method
    public void quickSortRun(int[] arr, int alt, int ust) {

        if (alt < ust) {
            int piv = partition(arr, alt, ust);
            quickSortRun(arr, alt, piv - 1); // pivotun sol tarafi icin calisir
            quickSortRun(arr, piv + 1, ust); // pivotun sag tarafi icin calisir
        }
    }

    // yardimci method
    public int partition(int[] arr, int alt, int ust) {

        // dizinin son elamani pivot seciliyor
        int pivot = arr[ust];
        int i = alt - 1;

        // alt ve ust sinir arasindaki elemanlari pivot ile
        // karsilastirip kucuk olanlari sola atiyorum
        for (int j = alt; j < ust; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot elemanin dizideki dogru konumu icin :
        int temp = arr[i + 1];
        arr[i + 1] = arr[ust];
        arr[ust] = temp;

        return i + 1;

    }
}
