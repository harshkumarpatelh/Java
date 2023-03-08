package KunalParctice.OOP3.Inheritance;

public class Box {
    int length;
    int side;
    String name;
    Box()
    {
        this.length =23;
        this.side =56;
    }

    public Box(int length, int side ,String nme) {
        this.length = length;
        this.side = side;
        name= nme;
        System.out.println("side = "+ side);
                                }
     Box (Box ob)
     {
         length =ob.length;
         side = ob.side;
         name = ob.name;
         System.out.println("Length = " + length);
     }
}
