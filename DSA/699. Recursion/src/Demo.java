public class Demo {
    public static void main(String[] args) {

        int n = 7;
        int result = fact(n);

        System.out.println("Factorial of " + n + " is " + result);
    }

    public static int fact(int f) {
        if (f > 0) {
            return f * fact(f - 1);
        }
        else return 1;

    }
}
