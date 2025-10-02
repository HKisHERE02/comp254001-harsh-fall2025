import java.util.Random;

public class UniquenessDriver {

    public static void main(String[] args) {
        Random rand = new Random();

        // check for unique1 (slow O(n^2))
        //int maxN1 = findMaxN(860000, 860000, true, rand);
        //System.out.println("=== Final Result ===");
        //System.out.println("Largest n for unique1 in under 1 minute: " + maxN1);

        // check for unique2 (fast O(n log n))
        int maxN2 = findMaxN(263000000, 263222222, false, rand);
        System.out.println("=== Final Result ===");
        System.out.println("Largest n for unique2 in under 1 minute: " + maxN2);
    }

    // Finds the biggest n that works in 1 min
    public static int findMaxN(int low, int high, boolean isUnique1, Random rand) {
        int answer = low;

        while (low <= high) {
            int mid = low + (high - low) / 2;


            // generate array
            int[] arr = new int[mid];
            if (isUnique1) {
                // worst-case: all distinct
                for (int i = 0; i < mid; i++) arr[i] = i;
            } else {
                // random values for unique2
                for (int i = 0; i < mid; i++) arr[i] = rand.nextInt(mid * 5);
            }

            // measure precise time
            long startTime = System.nanoTime();
            if (isUnique1) {
                Uniqueness.unique1(arr);
            } else {
                Uniqueness.unique2(arr);
            }
            long endTime = System.nanoTime();
            long elapsedMs = (endTime - startTime) / 1_000_000;

            System.out.println((isUnique1 ? "unique1" : "unique2")
                    + " tried n = " + mid
                    + " --> time = " + elapsedMs + " ms");

            if (elapsedMs <= 60000) { // under 1 minute
                answer = mid;  // latest good value
                low = mid + 1; // try bigger
            } else {
                high = mid - 1; // too slow, try smaller
            }
        }

        return answer;
    }
}
