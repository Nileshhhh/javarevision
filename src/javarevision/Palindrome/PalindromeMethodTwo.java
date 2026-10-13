package javarevision.Palindrome;

public class PalindromeMethodTwo {
    public static void main(String[] args) {
       String originalStr = "madam";
      StringBuilder isRev = new StringBuilder();

       for (int i=originalStr.length()-1; i>=0; i--)
       {
           isRev.append(originalStr.charAt(i));
       }
       if (isRev.toString() .equals(originalStr))
       {
           System.out.println("isPalindrome");
       }else {
           System.out.println("notPalindrome");
       }

    }
}
