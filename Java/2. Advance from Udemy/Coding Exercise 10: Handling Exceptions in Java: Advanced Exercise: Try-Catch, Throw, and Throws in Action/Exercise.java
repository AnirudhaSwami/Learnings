class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
} 

public class Exercise {
    
    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if (age<18)
            throw new InvalidAgeException("Age must be 18 or older");
        else 
            throw new InvalidAgeException("Access granted");
            
        
    }
    
    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        
        try{
            Exercise ex1 = new Exercise();
            ex1.checkAge(16);
        }
        catch(Exception ex){
            System.out.println("Exception caught:"+ex.getMessage());
        }

        try{
            Exercise ex2 = new Exercise();
            ex2.checkAge(21);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}