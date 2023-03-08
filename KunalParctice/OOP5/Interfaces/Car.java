package KunalParctice.OOP5.Interfaces;

public class Car implements Engine,Break{
    @Override
    public void start() {
        System.out.println("start");
    }


    @Override
    public void stop() {

        System.out.println("stop");
    }

    @Override
    public void acc() {
        System.out.println("accelerate");

    }

    @Override
    public void breake() {
        System.out.println("Break");

    }

    @Override
    public void start(int num) {
        System.out.println(num);
    }
}
