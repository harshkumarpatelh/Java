package Assignment.Function;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number you want factoril of : ");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Factorial of " + num +" is : " + fac(num) );
    }
    static long  fac(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            long  ans = 1;
            while(n!=1)
            {
                ans*=n;
                n--;
            }
            return ans;
        }
    }
}
