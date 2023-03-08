package Android.JavaPractice;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for(int i=n; i>=0; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
            for(int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
        }
    }
}
