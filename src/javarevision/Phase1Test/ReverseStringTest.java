package javarevision.Phase1Test;

public class ReverseStringTest {

    public static void main(String[] args) {
        String name ="Backend";
        int count = 0;
        char[] reverse = new char[name.length()];
        for (int i= name.length()-1; i>=0; i--)
        {
            reverse[count] = name.charAt(i);
            count++;

        }
        System.out.println(reverse);

    }
}
