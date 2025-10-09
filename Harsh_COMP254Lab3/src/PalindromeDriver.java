public class PalindromeDriver {
    public static void main(String[] args) {
        String s = "asdddsa";
        Boolean b = StringPalindrome.palindromeCheck(s, 0, s.length()-1);
        System.out.println(b);
    }
}
