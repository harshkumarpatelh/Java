package KunalParctice.OOP3.Inheritance;

public class Boxweight extends Box{
    int h;

//    public Boxweight(int length, int side, int h) {
//        super(length, side); //this is calling another constructor present in Box class OR
//        // calling parent class constructor
//        this.h = h;
//        System.out.println("Length = " + super.length);
//    }

//    public Boxweight(int h) {
//        this.h = h;
//    }

    public Boxweight(int length, int side, String nmae, int h) {
        super(length, side, nmae);
        this.h = h;
        System.out.println("Name " + nmae);
    }

//    public Boxweight(Box ob, int h) {
//        super(ob);
//        this.h = h;
//    }

    Boxweight(Boxweight ob)
    {
        super(ob);
        int w;
        System.out.println("h ="+ h);
    }

}
