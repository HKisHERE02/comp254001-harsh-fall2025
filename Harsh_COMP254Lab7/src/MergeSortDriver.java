import java.util.Comparator;

public class MergeSortDriver {
    public static void main(String[] args)
    {
        Integer[] S = new Integer[]{85, 24, 63, 45, 17, 31, 96, 50};

        //create a Comparator object
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }
        };

        MergeSort.mergeSort(S, comp);
        System.out.println("Sorted array (top-down):");
        for(Integer i : S)
            System.out.println(i);

        System.out.println("\nSorted queue (bottom-up):");

        Queue<String> q = new LinkedQueue<>();
        q.enqueue("pear");
        q.enqueue("apple");
        q.enqueue("orange");
        q.enqueue("banana");
        q.enqueue("grape");

        Comparator<String> stringComp = new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };

        MergeSort.mergeSortBottomUpQueue(q, stringComp);

        while (!q.isEmpty())
            System.out.println(q.dequeue());
    }

}
