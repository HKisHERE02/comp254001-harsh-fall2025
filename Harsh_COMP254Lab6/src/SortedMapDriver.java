public class SortedMapDriver {
    public static void main(String[] args) {

        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println("Is 10 available? " + map.containKey(10));
        System.out.println("Is 25 available? " + map.containKey(25));
        System.out.println("Is 30 available? " + map.containKey(30));
        System.out.println("Is 5 available? " + map.containKey(5));
    }
}
