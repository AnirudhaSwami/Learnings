
enum Status {
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Success;
        /*
         * if (s == Status.Running) {
         * System.out.println("The status is Running");
         * } else if (s == Status.Failed) {
         * System.out.println("The status is Failed");
         * } else if (s == Status.Pending) {
         * System.out.println("The status is Pending");
         * } else if (s == Status.Success) {
         * System.out.println("The status is Success");
         * } else {
         * System.out.println("Done");
         * }
         */
        switch (s) {
            case Running:
                System.out.println("The status is Running");
                break;
            case Failed:
                System.out.println("The status is Failed");
                break;
            case Pending:
                System.out.println("The status is Pending");
                break;
            case Success:
                System.out.println("The status is Success");
                break;
            default:
                System.out.println("Done");
        }
    }
}
