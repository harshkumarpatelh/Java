package LeetPractice;

import java.util.ArrayList;

public class shiftlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
         arr.add(0,67);
         arr.add(1,78);
        arr.add(2,79);
        arr.add(3,785);
        System.out.println(arr);

        arr.add(2,676);
        System.out.println(arr);
    }
}
