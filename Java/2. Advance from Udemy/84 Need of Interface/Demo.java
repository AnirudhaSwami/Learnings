
interface computer{
    public void code();
}

class laptop implements computer{
    public void code(){
        System.out.println("code, compile and run");
    }
}


class desktop implements computer{
    public void code(){
        System.out.println("code, compile and run, faster");
    }
}

class developer{
    public void devApp(computer comp){
        comp.code();
    }
}


public class Demo {
    public static void main(String [] args){
        computer lap = new laptop();
        computer desk = new desktop();

        developer dev = new developer();
        dev.devApp(desk);
    }
}
