package javarevision.Palindrome;

public class PalindromeMethodThree {
    public static void main(String[] args) {
        String originalStr = "Apple";
        originalStr = originalStr.toLowerCase();
        int left = 0;
        int right = originalStr.length() - 1;
        while (left < right){
            if (originalStr.charAt(left) != originalStr.charAt(right)) {
                System.out.println("isnotPalindrome");
                return;
            }
        left++;
        right--;
    }
        System.out.println("isPalindrome");

    }


}
