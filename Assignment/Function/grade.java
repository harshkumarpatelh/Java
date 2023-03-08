package Assignment.Function;
import java.util.Scanner;
public class grade {

    public static void main(String[] args) {

        System.out.println("Enter your marks : ");
        Scanner in =  new Scanner(System.in);
        int marks = in.nextInt();
        grade(marks);
    }
    static void grade(int x)
    {
        if (x<=100 && x>=91)
        {
            System.out.println("Your grade is AA");
        }
        else if (x<=90 && x>=81)
        {
            System.out.println("Your grade is AB");
        }
        else if(x<=80 && x>=71)
        {
            System.out.println("Your grade is BB");
        } else if (x<=70 && x>=61) {
            System.out.println("Your grade is BC");
        }
        else  if(x<=60 && x>=51)
        {
            System.out.println("Your grade is CD");
        }
        else if(x<=50 && x>=41)
        {
            System.out.println("Your grade is DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}
