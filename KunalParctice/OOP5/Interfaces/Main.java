package KunalParctice.OOP5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start(56);
//        car.acc();
//        car.breake();
//        car.stop();


        NiceCar niceCar = new NiceCar(new PowerEngine());//choosing different engine through constructor
        niceCar.start();                      // of NiceCar and creating object of type PowerEngine
        niceCar.Musicstart();             // to access all method of PowerEngine
        niceCar.stop();

        NiceCar niceCar1 =new NiceCar(new ElectricEngine()); //same as above
        niceCar1.start();
        niceCar1.Musicstart();
        niceCar1.stop();

    }
}
