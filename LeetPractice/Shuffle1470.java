package LeetPractice;

import java.util.ArrayList;
import java.util.List;

public class Shuffle1470 {


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for(int i=0; i<10; i++)
        {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                list.get(i).add(j, "Harsh "+ i);
            }

        }
//        System.out.println(list);
//        System.out.println(list.get(2).get(2).compareTo("harsh 2"));
//        System.out.println(list.get(3).toArray());


        int n =5 ;
        int [] ans = new int[n*2];
        ans[0] =0;
        ans[10]=9;
        System.out.println(ans[0]^0);
        System.out.println(ans.length);
    }
}
