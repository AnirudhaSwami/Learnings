class HigherDivisorException extends Exception{

    public  HigherDivisorException(String str)  {
        super(str);
    }
}


public class Demo {
    public static void main(String[] args) {

        int i = 10, j = 20, ans = 0;
        try {
            ans = i / j;
            if(j>i)
                throw new HigherDivisorException("Number should not be higher than "+ i);
            

            System.out.println(i + "/" + j + " = " + ans);
        
        } catch (HigherDivisorException e) {
            System.out.println("oops: " + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
