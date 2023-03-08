package KunalParctice.OOP5.Interfaces.NPTEL;

public interface Number {
    public int findSqr(int i);
}


class A implements Number{
    int i,square;
    public int findSqr(int i){
        square = i*i;
        return square;
    }


//    public int findSqr(int i){
//        return  i*i;
//    }

}