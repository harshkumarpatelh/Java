package LeetPractice;

import java.util.*;

public class formArray989 {

    public static void main(String[] args) {

      int num =999999;
      int k=1;
      num = num+k;
        System.out.println(num);

        int numk=0;
        for(int i=num; i!=0; i/=10)
        {
            numk =numk*10 + i%10;
        }

        System.out.println(numk);

        ArrayList<Integer>  ans = new ArrayList<>();
        for(int i=0; i<90; i++)
        {
            ans.add(i);
        }

        System.out.println(ans.size());

          ArrayList<Integer>  ans1 = new ArrayList<>();
          int n =1000000000;

    }


}
