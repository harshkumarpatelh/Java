package KunalParctice.OOP2;

import java.util.Scanner;

import static KunalParctice.Palindrome.isPalin;

public class OOP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s= in.next();
        System.out.println(isPalin(s));
    }
}

