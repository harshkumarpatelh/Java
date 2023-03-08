package Assignment.Function;
import java.util.Scanner;
public class palindromenumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner inn =new Scanner(System.in);
        int num = inn.nextInt();
        palindrome(num);
    }
    static void palindrome(int n)
    {
        int original=n;
        int sum=0;
        while(n!=0)
        {
            sum = (sum*10)+ n%10;
            n/=10;
        }

        if (original==sum)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
