package exercise1;

public class ArrayMax {
    public int findMax(int[] arr, int length){
        if (arr.length == 1) return arr[0];
        return Math.max(arr[length - 1], findMax(arr, length-1 ));
    }
}
