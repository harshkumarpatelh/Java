
package Assignment.Function;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in =  new Scanner(System.in);
        int num =  in.nextInt();
        System.out.println(isprime(num));

    }
    static String isprime(int x)
    {
        String ans ="Prime";
        if  (x<=1)
        {
            return "Not Prime";
        }
        else
        {
            int c=2;
            while(c<=x/2)
            {
                if (x%c==0)
                {
                    ans ="Not prime";
                    break;
                }
                c++;
            }
            return ans;
        }
    }

}
