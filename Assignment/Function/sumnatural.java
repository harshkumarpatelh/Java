package Assignment.Function;
import java.util.Scanner;
public class sumnatural {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Sum up to "+ n + " is : " + sumn(n));
    }
    static long sumn(int n)
    {
        long sum =0;
//        while(n>0)
//        {
//            sum+=n;
//            n--;
//        }
        sum = (long) n *(n+1)/2;

        return sum;
    }
}
