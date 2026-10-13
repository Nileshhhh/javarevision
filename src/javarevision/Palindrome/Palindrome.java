package javarevision.Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String originalStr = "madam";
        String isRev = "";
        for (int i = originalStr.length()-1; i>=0; i--)
        {
            isRev+= originalStr.charAt(i);
        }
        if ( isRev .equals(originalStr) )
        {
            System.out.println("isPalindome");
        } else {
            System.out.println("notPalindrome");
        }
    }
}
