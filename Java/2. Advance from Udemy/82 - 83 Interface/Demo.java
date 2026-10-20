interface A {

    int a = 10;
    String city = "pune";

    void show();

    void area();
}

interface X{
    void run();
}
interface Y extends X{

}

class B implements A, Y {
    public void show() {
        System.out.println("I am in show method");
    }

    public void area() {
        System.out.println("I am in area method");
    }

    public void run(){
        System.out.println("Just Run my boy");
    }
}

public class Demo {
    public static void main(String args[]) {
        A obj = new B();
        obj.show();
        obj.area();
        System.out.println("a: "+A.a);
        System.out.println("city: "+A.city);

        Y obj1 = new B();
        obj1.run();
    }
}