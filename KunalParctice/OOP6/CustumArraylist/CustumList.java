package KunalParctice.OOP6.CustumArraylist;

import java.util.Arrays;

public class CustumList {
    private int [] arr;
    private int DEFAULT_SIZE =10;
    private  int size =0;
    private boolean isFull(){
        return  size == arr.length;
    }

    public CustumList() {
        arr = new int [DEFAULT_SIZE];
    }

    public void add(int num){

        if(isFull())
        {
            resize();
        }
        arr[size++] =num;
    }

    private void resize() {
        int [] temp = new int[DEFAULT_SIZE*2];
        for(int i=0; i<arr.length; i++)
        {
            temp [i]=arr[i];
        }
        arr = temp;
    }

    @Override
    public String toString() {
        return "CustumList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void setArr(int index , int value)
    {
        arr[index] =value;
    }
    public int  remove()
    {
        int data = arr[--size];
        return data;
    }
   public String  display()
   {
      return (Arrays.toString(arr));
   }

}
