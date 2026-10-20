class Student{
    private String name;
    private int rollNo;

    public void setter(String stName, int stRollNo){
        name = stName;
        rollNo = stRollNo;

    }
    public String getterName(){
        return name;
    }

    public int getterRollNo(){
        return rollNo;
    }
}
public class J002_Encapsulation {
    public static void main(String [] args){
        Student st = new Student();

        st.setter("Anirudha", 101);
        System.out.println(st.getterName());
        System.out.println(st.getterRollNo());
    }    
}
