import java.util.Scanner;
public class Demo {
    public static void main(String [] args){

        int quotient = 0, reminder = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dividend : ");
        int dividend = sc.nextInt();

        System.out.print("Divisor : ");
        int divisor = sc.nextInt();

        sc.close();
        try{
            quotient = dividend / divisor;
            reminder = dividend % divisor;

            System.out.println("Quotient : "+ quotient);
            System.out.println("Remider : "+ reminder);
        }
        catch(Exception ex){
            System.out.println("Error : "+ex.toString());
            System.out.println("Ans : N.D.");
        }
        
       System.out.println("Calculation is completed.");
    }    
}
