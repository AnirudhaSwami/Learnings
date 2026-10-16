import java.io.*;

public class Demo {
    /*
     * public static void main(String [] args){
     * int i=0,j=0, div=0;
     * 
     * try{
     * div = i/j;
     * }
     * catch(Exception ex){
     * System.out.println("j: "+j +" "+ ex);
     * }
     * finally{
     * System.out.println("j: "+j+". This execute even you get catch.");
     * }
     * }
     */

    /*
     * public static void main(String [] args) throws NumberFormatException,
     * Exception{
     * int num = 0;
     * BufferedReader bfr = null;
     * try{ public static void main(String [] args) throws NumberFormatException,
     * Exception{
     * int num = 0;
     * BufferedReader bfr = null;
     * try{
     * System.out.print("Enter a number: ");
     * //InputStreamReader in = new InputStreamReader(System.in);
     * //bfr = new BufferedReader(in);
     * bfr = new BufferedReader(new InputStreamReader(System.in));
     * num = Integer.parseInt(bfr.readLine());
     * }
     * finally{
     * System.out.println("Statement from 'finally block'");
     * bfr.close();
     * }
     * }
     * System.out.print("Enter a number: ");
     * //InputStreamReader in = new InputStreamReader(System.in);
     * //bfr = new BufferedReader(in);
     * bfr = new BufferedReader(new InputStreamReader(System.in));
     * num = Integer.parseInt(bfr.readLine());
     * }
     * finally{
     * System.out.println("Statement from 'finally block'");
     * bfr.close();
     * }
     * }
     */

    public static void main(String[] args) throws NumberFormatException, Exception {
        int num = 0;
        
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number: ");
            // InputStreamReader in = new InputStreamReader(System.in);
            // bfr = new BufferedReader(in);      
            num = Integer.parseInt(bfr.readLine());
        } 
    }
}