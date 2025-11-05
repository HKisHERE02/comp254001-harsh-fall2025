package exercise3;

import java.util.Arrays;

public class TenLarge {
    public static int[] tenLarge(int[] arr){
        Arrays.sort(arr); // sort in ascending order
        int n = arr.length;
        int[] topTen = new int[10];
        for (int i = 0; i < 10; i++) {
            topTen[i] = arr[n - 10 + i];
        }
        return topTen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(tenLarge(arr)));
    }
}
