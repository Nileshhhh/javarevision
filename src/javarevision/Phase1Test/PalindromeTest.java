package javarevision.Phase1Test;

public class PalindromeTest {
    public static void main(String[] args) {
        String name = "Racecar".toLowerCase();

        int left = 0;
        int right = name.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "isPalindrome" : "isNotPalindrome");
    }
}