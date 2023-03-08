package KunalParctice.OOP5.Nestedinterface;

public class A {
     public interface Nestedinterface{
         boolean isOdd(int num);

     }
}

class B implements A.Nestedinterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) ==1;
    }
}
