
@FunctionalInterface 
interface A{
    //void show();
    void show(int i);
}

public class Demo {
    public static void main(String [] args){
        // A obj = () ->  // -> is Lamba function
        // {
        //         System.out.println("We are in show of annonymous inner class by using lambda function");
        // };
        //obj.show();

        A obj = (int i) -> System.out.println("Lambda function showing value of i = "+i);
        
        obj.show(5);
    }
}
