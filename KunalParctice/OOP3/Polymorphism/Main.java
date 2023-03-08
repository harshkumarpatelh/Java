package KunalParctice.OOP3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle  = new Circle();
        Square square = new Square();

        circle.area(); // polymorphism via overriding
        square.area();

        Shapes r;
        r=circle;
        r.area();

    }
}
