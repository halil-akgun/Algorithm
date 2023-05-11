package BigO;

// elimizdeki veri seti arttikca , algoritmanin calistirilma suresi dogru orantili sekilde artis gosterir

public class On { // O(n) --> Linear Complexity

    public static void main(String[] args) {

        // arrayin butun elemanlarini ekrana basalim
        int[] arr = {1, 2, 5, 9, 6, 3, 4};
        for (int w : arr) {
            System.out.println(w + ", ");
        }
    }
}
