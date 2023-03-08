package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []ar = {2,3,4,5,8,18};
        if(Binarysearch(0,ar.length-1,ar,8)!=-1)
            System.out.println("Found at position "+Binarysearch(0,ar.length-1,ar,8));
        else System.out.println("Not found");
    }
    static int Binarysearch(int start ,int end,int ar[],int target)
    {
        int mid = start +(end-start)/2;
        if(ar[mid]==target)
            return mid;
        else if(ar[mid]>target)
            return Binarysearch(start,mid-1,ar,target);
        else
            return Binarysearch(mid+1,end,ar,target);
    }
}
