import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String [] args) throws IOException{
        int num;
        System.out.println("Enter the number: ");
        //num = System.in.read(); // provide you an ASCII value
        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(in);
        
        num = Integer.parseInt(bfr.readLine());
        System.out.println(num);
        bf.close();
        */

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(num);

        
        sc.close();
    }
}
