@FunctionalInterface 
interface A{
    int show(int i);
}

public class Demo{
    public static void main(String [] args){
        /*A obj = (int i) ->{
            return i*i;
        };
        */
        
        A obj = i -> i*i;
        int result = obj.show(5);
        System.out.println("Square is : " +result);
    }
}