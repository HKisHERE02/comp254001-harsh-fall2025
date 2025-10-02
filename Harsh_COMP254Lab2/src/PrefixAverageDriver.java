import java.util.Random;

public class PrefixAverageDriver {

    public static void main(String[] args) {
        int[] sizes = {5000, 10000, 20000, 40000, 80000, 160000, 320000, 640000};
        Random rand = new Random();

        for (int n : sizes) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++)
                arr[i] = rand.nextDouble();

            //(O(n^2))
            long start = System.currentTimeMillis();
            PrefixAverage.prefixAverage1(arr);
            long end = System.currentTimeMillis();
            long time1 = end - start;

            //(O(n))
            start = System.currentTimeMillis();
            PrefixAverage.prefixAverage2(arr);
            end = System.currentTimeMillis();
            long time2 = end - start;

            //table
            System.out.println("n = "+ n + "\t" + "Time one = " + time1 + "\t\t"+ "Time two = " + time2);


        }
    }
}
