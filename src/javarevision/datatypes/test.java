package javarevision.datatypes;

public class test {
    public static void main(String[] args) {
        int[] a = {2,5,4};
        int max = a[0];
        int secondLargest = a[1];
        if (a[0] > a[1])
        {
            max=a[0];
            secondLargest = a[1];
        }else {
            secondLargest = a[0];
            max = a[1];
        }
        for (int i =2; i<a.length; i++)
        {
            int current = a[i];
            if(current >max)
            {
                secondLargest=max;
                max = current;
            }
            else if (current > secondLargest && current != max) {
                secondLargest = current;
            }

        }
        System.out.println(secondLargest);


    }
}
