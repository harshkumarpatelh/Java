package Sorting;

import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
    public static void main(String[] args) {
        int []arr ={1,23,45,32,675,54,4};
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));

        mergesortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    //through making new object every time
    static int [] mergeSort(int []arr)
    {
        if(arr.length ==1)
            return arr;

        int mid = arr.length /2;
        int []left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid ,arr.length));

        return  merge(left,right);
        
    }

    private static int[] merge(int[] first, int[] second) {
        int []mix = new int[first.length+second.length];

        int i=0; int j=0;
        int k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k] =first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //when one of them is not completely mix in the final sorted array

        // only one while loop will run from the below

        while(i<first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }

        while (j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }

    // through parting the original array

    static void mergesortInplace(int []arr ,int s,int e)
    {
        if (e-s==1)
            return ;
        int mid = (s+e)/2;
        mergesortInplace(arr,s,mid);
        mergesortInplace(arr,mid,arr.length);

        merge1(arr,s,mid,e);
    }

    private static void merge1(int[] arr, int s, int mid, int e) {
        int []mix = new int [e-s];

        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e)
        {
            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }

            k++;
        }

        while(i<mid){
            mix[k]= arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++)
            arr[s+l] =mix[l];

    }

}
