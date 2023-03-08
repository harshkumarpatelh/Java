package KunalParctice.Practice;

public class Emp {
    String name;
    int salary;
    String cname;


    void show()
    {
        System.out.println(name +" " + salary+" "+cname);
    }

    void input(String n,int s , String c)
    {
        name = n;
        salary= s;
        cname= c;

    }
}
