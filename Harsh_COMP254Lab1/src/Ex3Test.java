public class Ex3Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        CircularlyLinkedList<String> circularList = new CircularlyLinkedList<>();
        circularList.addFirst("LAX");
        circularList.addLast("MSP");
        circularList.addLast("ATL");
        circularList.addLast("BOS");

        System.out.println("Original list: " + circularList);

        CircularlyLinkedList<String> clonedList = circularList.clone();
        System.out.println("Cloned list:   " + clonedList);

    }

}
