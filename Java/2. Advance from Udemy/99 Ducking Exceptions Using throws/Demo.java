class A{
    void show() throws ClassNotFoundException{
       
           Class.forName("Calc");
        
    }
}


public class Demo {
    public static void main(String [] args){
        try{
            A obj = new A();
            obj.show();
        } catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
        }
    }
}
