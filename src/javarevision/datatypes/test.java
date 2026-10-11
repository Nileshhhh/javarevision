package javarevision.datatypes;

public class test {
    public static void main(String[] args) {
        int[] a = {35, 53, 47, 74, 94, 29};

        if (a == null || a.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        int max, secondLargest;

        if (a[0] > a[1]) {
            max = a[0];
            secondLargest = a[1];
        } else {
            max = a[1]; // Fixed bug
            secondLargest = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            int current = a[i];
            if (current > max) {
                secondLargest = max;
                max = current;
            } else if (current > secondLargest && current != max) {
                secondLargest = current;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}