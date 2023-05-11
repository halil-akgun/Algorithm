package BigO;

// Array ne kadar buyuk olursa olsun , algoritmanin calistirilma suresi hep sabit kalacaktir

public class O1 {  // O(1)  ---> Constant Complexity

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9, 6, 3, 4};
        System.out.println(arr[arr.length-1]);

        System.out.println(10%2==0); // tek sayi, cift sayi kontrolu
    }
}
