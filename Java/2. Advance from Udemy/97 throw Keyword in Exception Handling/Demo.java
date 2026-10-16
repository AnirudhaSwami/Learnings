
public class Demo {
    public static void main(String[] args) {

        int i = 10, j = 20, ans = 0;
        try {
            ans = i / j;
            if(j>i)
                throw new ArithmeticException("Number should not be higher than "+ i);
            

            System.out.println(i + "/" + j + " = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
