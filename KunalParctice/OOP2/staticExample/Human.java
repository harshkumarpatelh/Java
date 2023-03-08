package KunalParctice.OOP2.staticExample;

public class Human {
    int age;
    int salary;
    boolean married;
     static long population; // -> the fact i.e. true to all or same to all then use "static" keyword

    public Human(int age, int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.married = married;

        Human.population =300;
        //OR this.population; -> this is also valid but convention is to use class name "Human"
    }
}
