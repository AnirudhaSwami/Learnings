abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR");
    }
}

class updatedWagonR extends WagonR{                 //Concrete class
public void fly(){
    System.out.println("Flying car.");
}

}
public class Demo{
    public static void main(String [] args){
    
        Car obj = new updatedWagonR();          //Object of concrete class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}