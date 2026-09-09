public class secondLargest {

    public static void main(String[] args) {

        int[] num = {45, 22, 88, 16, 90, 33};

        int secondMax = Integer.MIN_VALUE;

        int max = num[0];

        for (int n : num) {

            if (n > max) {
                secondMax = max;
                max = n;
            }
            else if (n < max && n > secondMax) {
                secondMax = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }
}