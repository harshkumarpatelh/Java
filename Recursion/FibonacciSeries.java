package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
//        System.out.print(0 + " "+1);
        System.out.print(" " +fibo(n));
    }
    static int fibo(int n)
    {
        if(n==1)
            return 1;

        if(n==0)
            return 0;

        return fibo(n-1)+fibo(n-2);

    }
}
