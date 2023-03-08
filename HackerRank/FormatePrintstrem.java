package HackerRank;

public class FormatePrintstrem {
    public static void main(String[] args) {
        int N=32;
        System.out.println("00" +N);
        for(int i=1; i<11; i++)
        {
            System.out.println(N +"*" +i + " = "+  N*i);
        }
    }
}
