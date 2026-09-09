public class J001_StringBuffer {
    public static void main(String [] args){
        StringBuffer sb  = new StringBuffer("Navin");
        System.out.println("capacity: "+sb.capacity());
        System.out.println("length: "+sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        System.out.println("capacity: "+sb.capacity());
    }    
}
