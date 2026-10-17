package javarevision.Phase1Test;

public class FibonacciArray {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]);
        }
    }
}
