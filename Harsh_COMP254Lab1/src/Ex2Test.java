import org.w3c.dom.Node;

public class Ex2Test {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("MSP");
        list.addLast("ATL");
        list.addLast("BOS");
        list.addFirst("LAX");

        System.out.println("Before swap: " + list);

        list.swapNodesByValue("MSP", "BOS");

        System.out.println("After swap: " + list);
    }
}
