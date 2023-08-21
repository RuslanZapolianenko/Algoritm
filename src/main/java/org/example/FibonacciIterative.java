package org.example;

 public class FibonacciIterative {
    public static long calculateFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev = 0;
        long current = 1;
        for (int i = 2; i <= n; i++) {
            long temp = current;
            current = prev + current;
            prev = temp;
        }
        return current;
    }


     }

