package javarevision.Phase1Test;

public class FibonacciRecursion {

    public static int fib(int n) {
        // Base Case
        if (n <= 1) {
            return n;
        }
        // Recursive Case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fib(10);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}