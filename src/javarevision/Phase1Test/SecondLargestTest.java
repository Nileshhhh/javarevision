package javarevision.Phase1Test;

public class SecondLargestTest {

    public static void main(String[] args) {
        int[] num ={35, 53, 47, 74, 94, 29};
        int max, secondLargest, current;
        if(num[0] > num[1])
        {
            max = num[0];
            secondLargest = num[1];
        }else
            max = num[1];
            secondLargest = num[0];
        for (int i=2; i<num.length; i++)
        {
             current  = num[i];
             if (current >max)
             {
                 secondLargest = max;
                 max=current;
             }else if (current >secondLargest && current != max)
            {
                secondLargest =current;
            }
        }
        System.out.println(secondLargest);
    }
}
