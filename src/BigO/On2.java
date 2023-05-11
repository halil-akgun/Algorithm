package BigO;

// input buyuklugunun karesi ile dogru orantili

public class On2 { // O(n^2) ---> Quadratic Complexity

    public static void main(String[] args) {

        int count = 0;
        int[] arr = {1, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + arr[j]);
                count++;
            }
        }
        System.out.println(count);
    }
}
