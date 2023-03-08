package Android.JavaPractice;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        System.out.print(" Enter two number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Sum is " + (num1+num2) );
    }
}
