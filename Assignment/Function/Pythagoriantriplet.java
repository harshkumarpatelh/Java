package Assignment.Function;
import java.util.Scanner;
public class Pythagoriantriplet {
    public static void main(String[] args) {
        System.out.println("Enter three numbers : ");
        Scanner in= new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(triplet(num1,num2,num3));
    }
    static boolean triplet(int a, int b ,int c)
    {
        return ((a*a + b*b )== c*c);
    }
}
