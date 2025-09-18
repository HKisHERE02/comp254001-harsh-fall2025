public class Ex1Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> list1 = new DoublyLinkedList<String>();
        list1.addFirst("First");
        list1.addLast("First");
        list1.addLast("First");
        list1.addFirst("First");

        DoublyLinkedList<String> list2 = new DoublyLinkedList<String>();
        list2.addFirst("Second");
        list2.addLast("Second");
        list2.addLast("Second");
        list2.addFirst("Second");

        System.out.println(list1);
        list1.concatenate(list1, list2);
        System.out.println(list1);
    }
}