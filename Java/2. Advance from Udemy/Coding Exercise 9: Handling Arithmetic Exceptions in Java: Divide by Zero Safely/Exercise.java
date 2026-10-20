public class Exercise {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        // TODO: Handle division using try-catch

        try{
            System.out.println(numerator/denominator);
        } catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        } finally{
            System.out.println("Program completed");
        }
    }
}
