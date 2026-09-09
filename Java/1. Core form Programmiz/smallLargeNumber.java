import java.util.Arrays;

public class smallLargeNumber{

    public static void main(String [] args){

        int num[] = {45, 22, 89, 16, 90, 33};
        
        int min=num[0], max=num[1];
        
       
        for(int n : num){
            
            if(n>max){
                max = n;
            }

            if(n<min){
                min = n;
            }
        }

        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    } 
}
