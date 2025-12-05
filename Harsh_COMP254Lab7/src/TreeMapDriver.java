public class TreeMapDriver {
    public static void main(String[] args)
    {
        // Create a Binary Search Tree
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(6, "A");
        map.put(2, "B");
        map.put(4, "C");
        map.put(1, "D");
        map.put(9, "E");
        map.put(8, "F");

        System.out.println("Searching for key 4:");
        System.out.println("Result = " + map.get(4));   //tests treeSearch
    }

}
