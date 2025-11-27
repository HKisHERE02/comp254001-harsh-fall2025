public class HashMapDriver {
    public static void main(String[] args) {

        double loadFactor = 0.5;   // we can change like 0.25 0.9 etc
        ChainHashMap<Integer, Integer> map = new ChainHashMap<>(17, loadFactor);

        System.out.println("Initial capacity = " + map.getCapacity());
        int lastCapacity = map.getCapacity();

        for (int i = 0; i < 200; i++) {   // inserting 200 items
            map.put(i, i);

            // check if a resize happened
            if (map.getCapacity() != lastCapacity) {
                System.out.println("\nMap resized");
                System.out.println("Size at resize = " + map.size());
                System.out.println("New capacity = " + map.getCapacity());

                lastCapacity = map.getCapacity(); // update
            }
        }

        System.out.println("\nFinal size = " + map.size());
        System.out.println("Final capacity = " + map.getCapacity());
    }
}
