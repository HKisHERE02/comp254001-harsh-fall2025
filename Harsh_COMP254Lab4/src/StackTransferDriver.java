public class StackTransferDriver {
    public static void main(String[] args) {
        Stack<Integer> S = new ArrayStack<>();
        Stack<Integer> T = new ArrayStack<>();

        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);

        System.out.println("Before transfer:");
        System.out.println("S = " + S);
        System.out.println("T = " + T);

        //transfer
        ArrayStack.transfer(S, T);

        System.out.println("\nAfter transfer:");
        System.out.println("S = " + S);
        System.out.println("T = " + T);
    }
}
