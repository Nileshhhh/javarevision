package javarevision.datatypes;

import java.util.Arrays;



public class ReverseString {
    public static void main(String[] args) {
        String name = "Nilesh";
        char[] reverse = new char[name.length()];
        int j=0;
        for (int i = name.length()-1; i>=0 ; i--) {
            reverse[j]=name.charAt(i);
            j++;
        }
        for (char result : reverse)
        {
            System.out.print(result);
        }


    }


}
