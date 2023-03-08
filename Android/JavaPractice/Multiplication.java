package Android.JavaPractice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Table of " + num +" is :");
        for(int i=1; i<11; i++)
        {
            System.out.print(num*i +" ");
        }
    }
}
