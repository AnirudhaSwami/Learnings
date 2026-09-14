
enum Status {
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String[] args) {
        Status[] sts = Status.values();

        for (Status ss : sts) {
            System.out.println(ss.ordinal() + " : " + ss);
        }

    }
}
