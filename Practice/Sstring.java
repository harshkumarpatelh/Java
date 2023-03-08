package Practice;

import java.util.Arrays;
import java.util.Locale;

public class Sstring {
    String s ="6468.475.476";
    String s1 ="Devrat";
    int size = s.length();
    int [] index = {2,4,1,0,3};


    public static void main(String[] args) {
//        Sstring str = new Sstring();
//        System.out.println(str.s);
//        System.out.println(str.size);
//        StringBuilder ans = new StringBuilder(str.s);
//
//        for(int i=0; i<str.s.length(); i++)
//        {
//            if(str.s.charAt(i)=='.')
//            ans.insert(i-1,'[');
//            ans.insert(i+1,']');
//        }
//
////        System.out.println(ans);
//
//        for(char ch : str.s1.toCharArray())
//        {
//            System.out.print(ch +" ");
//            int i = ch + 1;
//            System.out.println((char) i);
//            break;
//        }

//         String[] word ={"harsh","dev"};
//
//         String w = "";
//         for(int i=0; i<word.length; i++)
//         {
//             w+= word[i];
//         }
//
//         String up = "HARSh";
//        System.out.println(up.toLowerCase());
//        System.out.println(up.toUpperCase());
//
//        System.out.println(w);


//        String s= "10#11#12";
//        System.out.println(freqAlphabets(s));

//        for(int i=65; i<91; i++)
//            System.out.print((char)(i) + " ");

        String s ="01111111011110";
        System.out.println(canReach(s,1,9));
    }
//    static public String freqAlphabets(String s) {
//        StringBuilder ans = new StringBuilder();
//        String change="";
//        for(int i=0; i<s.length(); i++)
//        {
//            if(i<s.length()-2)
//            {
//                if(s.charAt(i+2)=='#')
//                {
//                    int a =(s.charAt(i));
//                    System.out.println(a);
//                    String val = ((s.charAt(i))) + s.charAt(i+1)+ change ;
//                    System.out.println(val);
////                    ans.append((char)('a'+val-1));
//                    i+=2;
//                }
//                else
//                    ans.append((char)((int)(s.charAt(i))-1+'a'));
//            }
//            else
//                ans.append((char)((int)(s.charAt(i))-1+'a'));
//        }
//
//        return ans.toString();
//    }

    static public boolean canReach(String s, int minJump, int maxJump) {
        int temp=0;
        int i;
        for(i=0; i<s.length(); i++)
        {
            if(i+maxJump <= s.length()-1 )
            {
                // i+=maxJump-1;
                if(s.charAt(i+maxJump)=='0' )
                {
                    i+=maxJump-1;
                    temp=1;
                }

                else if(s.charAt(i+minJump)=='0')
                {
                    i+=minJump-1;
                    temp=1;
                }
                else
                    break;

            }
            else  if(i+minJump <= s.length()-1 )
            {
                if(s.charAt(i+minJump)=='0')
                {
                    i+=minJump-1;
                    temp=1;
                }
                else
                    break;

            }
            else
                break;

        }

        if(i==s.length()-1 && temp==1)
            return true;
        else
            return false;


    }
}
