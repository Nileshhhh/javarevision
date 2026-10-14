package javarevision.Collections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nilesh");
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Sneha");

        for (String i:names)
        {
            System.out.println(i);
        }
    }
}
