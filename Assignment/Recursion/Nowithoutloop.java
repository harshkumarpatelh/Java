package Assignment.Recursion;
import java.util.Scanner;
public class Nowithoutloop {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
         woutloop(n);

    }
    static void woutloop(int n)
    {
        if(n!=0)
        {
            System.out.print(n + " ");
           woutloop(n-1);
           if(n==1)
           {
               System.out.println();
           }
           System.out.print(n + " ");
        }

        return;
    }

}
