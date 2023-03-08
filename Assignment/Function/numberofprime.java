package Assignment.Function;
import java.util.Scanner;
public class numberofprime {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner in= new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        numprime(num1,num2);

    }
    static void numprime(int n, int m)
    {
        while(n<m)
        {
            int temp=1;
            if (n>1){
                int c=2;
                while(c<=n/2)
                {
                    if(n%c==0) {
                         temp=0;
                        break;
                    }
                    c++;
                }
                if(temp==1)
                {
                    System.out.print(n + " ");
                }

            }
             n++;

        }
    }
}
