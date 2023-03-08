package KunalParctice.OOP2.staticExample;
// since human class and main class both are in same folder i.e. in staticExample
// therefore no need to import human class in main class
public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(20 ,132000,false);
        Human rahul = new Human(30 ,13200,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
