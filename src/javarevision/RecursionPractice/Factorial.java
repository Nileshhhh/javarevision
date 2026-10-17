package javarevision.RecursionPractice;

public class Factorial {
    public static int factorial(int n)
    {
        if(n<=0){   // base case
            return 1;
        }
        return n * factorial(n-1); // recursive case
    }
    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println(result);
    }
}