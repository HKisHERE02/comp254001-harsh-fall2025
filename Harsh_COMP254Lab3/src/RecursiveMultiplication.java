public class RecursiveMultiplication {
    public static int multiplyRecursion(int m, int n){
        if (n == 0) return 0;
        return m + multiplyRecursion(m, n-1);
    }
}
