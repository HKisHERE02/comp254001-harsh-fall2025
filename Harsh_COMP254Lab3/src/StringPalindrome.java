public class StringPalindrome {
    public static boolean palindromeCheck(String s, int low, int high){
        if (low >= high) return true;
        if (Character.toUpperCase(s.charAt(low)) == Character.toUpperCase(s.charAt(high))) return palindromeCheck(s, low+1, high-1);
        return false;
    }
}
