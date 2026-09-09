abstract class A{
    public abstract void show();
}

public class Demo {
    public static void main(String [] args){
        A obj = new A(){                //anonymous inner class for abstract class
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }    
}
