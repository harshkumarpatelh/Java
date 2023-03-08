package KunalParctice.OOP4.objectclass;

public class Objectdemo {

    int num;

    public Objectdemo(int num) {
        this.num = num;
    }

    public Objectdemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num ==((Objectdemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        Objectdemo object1 = new Objectdemo(32);
        Objectdemo object2 = new Objectdemo(32);
//        System.out.println(object1.hashCode());
        if(object1.equals(object2))
        {
            System.out.println("Both are equal");
        }
    }
}
