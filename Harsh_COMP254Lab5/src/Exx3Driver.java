public class Exx3Driver {
    public static void main(String[] args) {
        HeapPriorityQueue<String,String> heapQueue = new HeapPriorityQueue<String,String>();
        heapQueue.insert("47", "A");
        heapQueue.insert("75", "C");
        heapQueue.insert("28", "B");
        heapQueue.insert("51", "D");
        heapQueue.insert("31", "F");
        heapQueue.insert("22", "G");
        heapQueue.insert("15", "H");

        // list all entries
        for (int i=0;i < heapQueue.size();i++)
            System.out.println("(" +heapQueue.heap.get(i).getKey() +
                    ", " + heapQueue.heap.get(i).getValue() + ")" );
        //get the minimum
        System.out.println(heapQueue.min().getKey());
    }
}
