package KunalParctice.OOP2;

public class Singleton {
    private Singleton()
    {

    }
     private static Singleton obj;
     static Singleton getinstance()
    {
        if (obj==null)
        {
            obj = new Singleton();
        }
        return obj;
    }
}
