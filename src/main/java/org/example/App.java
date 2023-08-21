package org.example;


public class App 
{
    public static void main( String[] args )
    {
        FibonacciIterative  fibonacciIterative = new FibonacciIterative();
        System.out.println(fibonacciIterative.calculateFibonacci(10));

        FibonacciRecursive fibonacciRecursive = new  FibonacciRecursive();
        System.out.println(fibonacciRecursive.calculateFibonacci(10));

        FibonacciDynamicProgramming fibonacciDynamicProgramming = new FibonacciDynamicProgramming();
        System.out.println(fibonacciDynamicProgramming.calculateFibonacci(10));
    }

}
