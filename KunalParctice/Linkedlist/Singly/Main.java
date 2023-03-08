package KunalParctice.Linkedlist.Singly;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singly obj = new Singly();
//        obj.insertfirst(12); // you cannot call this function unless the object is created in the main function
//        System.out.println("Enter the data: ");
        Scanner in = new Scanner(System.in);
//        int val = in.nextInt();
        int temp=1;
        while(temp!=0)
        {
            System.out.println("Enter the data: ");
            int val = in.nextInt();
            obj.insertfirst(val);
            System.out.println("element entered successfully");
            System.out.println("Enter 1 to enter element ");
            System.out.println("Enter 0 not to terminate process :");
            temp = in.nextInt();
        }

        obj.display();


    }


}
