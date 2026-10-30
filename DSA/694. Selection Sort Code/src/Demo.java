public class Demo {
    public static void main(String[] args) {
        int[] nums = {8, 6, 5, 2, 3, 7};

        System.out.println("Before selection sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        //System.out.println("");
        selectionSort(nums);
        System.out.println("\nAfter selection sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        //System.out.println("");
    }

    static void selectionSort(int[] nums) {
        int len = nums.length;
        int minIndex = -1;
        int temp = 0;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {

                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

//            System.out.println("");
//            for (int num : nums) {
//                System.out.print(num + " ");
//            }
        }

    }
}
