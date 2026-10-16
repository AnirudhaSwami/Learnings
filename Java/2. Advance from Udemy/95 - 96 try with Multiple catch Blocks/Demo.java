import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int quotient = 0, reminder = 0;

        String str = null;

        int[] numbers = { 10, 20, 30, 40, 50 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Dividend : ");
        int dividend = sc.nextInt();

        System.out.print("Divisor : ");
        int divisor = sc.nextInt();

        System.out.print("Index : ");
        int index = sc.nextInt();

        sc.close();
        try {
            quotient = dividend / divisor;
            reminder = dividend % divisor;

            System.out.println("Quotient : " + quotient);
            System.out.println("Remider : " + reminder);

            System.out.println("Number at index : " + index + " is " + numbers[index]);

            System.out.println(str.length());

        } catch (ArithmeticException ex) {
            System.out.println("Error : divisor should not be zero.");

        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error : index should be less than or equal to array limit.");
        }
        catch (Exception ex) {
            System.out.println("Error : Something went wrong."+ex);
        }
        System.out.println("process is completed.");
    }
}
