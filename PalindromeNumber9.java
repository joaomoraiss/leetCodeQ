public class PalindromeNumber9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12122));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(Integer.toString(x));
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();

        if (str2.toString().equals(str.toString()))return true;
        else return false;
    }
}
