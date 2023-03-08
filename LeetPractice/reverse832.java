package LeetPractice;

import java.util.Arrays;

public class reverse832 {
    public static void main(String[] args) {
        int[][] ar ={{1,2,4},{2,9,8,4},{6,32,823}};
        for (int[] ints : ar) {
            System.out.println(Arrays.toString(ints));
        }
             for(int i=0; i<ar.length; i++)
             {
                 int col=ar[i].length;
                 int k=col;
                 for(int j=0; j<(col)/2; j++)
                 {
                     int temp=ar[i][j];
                     ar[i][j]=ar[i][k-1];
                     ar[i][k-1]=temp;
                     k--;
                 }
             }
        for (int[] n : ar) {
            System.out.println(Arrays.toString(n));
        }


    }

}
