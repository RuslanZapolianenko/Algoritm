package org.example;

public class FibonacciDynamicProgramming {
    public static long calculateFibonacci(int n) {
        if (n <= 0) return 0;

        long[] fibArray = new long[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
}
