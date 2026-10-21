package javarevision.Phase1Test;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {5, 2, 9, 1, 5, 6};
        int temp = 0;
        for (int i=0; i<num.length-1; i++)
        {
            for (int j =0; j<num.length-i-1; j++)
            {
                if (num[j] > num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }

        }
        for (int i = 0; i< num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
