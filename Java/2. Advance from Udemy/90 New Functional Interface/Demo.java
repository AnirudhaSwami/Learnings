@FunctionalInterface  // Interface with only one method
interface A{
    void show();
}
// class B implements A{

//     public void show(){
//         System.out.println("We are in show in B");
//     }
// }

public class Demo {
    public static void main(String [] args){
        A obj = new A(){
            public void show(){
                System.out.println("We are in show of annonymous inner class");
            }
        };
        obj.show();
    }
}
