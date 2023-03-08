package KunalParctice.OOP2.staticExample;

import java.util.Scanner;

public class Innerclass {
//    String name;
   static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
//        Test obj = new Test("harsh");
//        Test obj2 = new Test("Dev");
          Test obj3= new Test( "Harsh");
          System.out.println(obj3.name);

//        System.out.println(obj.name);
//        System.out.println(obj2.name);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        int n1 = in.nextInt();
        System.out.println(n);
        System.out.println(n1);
        System.out.println(s);

    }
}
