public class Demo {

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 64, 5, 4, 3, 2, 1};


        System.out.println("Before bubble sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        bubbleSort(nums);
        System.out.println("After bubble sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }


    public static void bubbleSort(int[] nums) {
        boolean isSwapped;
        int temp = 0;
        int len  = nums.length - 1;
        do {
            isSwapped = false;
            for (int k = 0; k < len; k++) {
                //System.out.println("k : " + k);

                if (nums[k] > nums[k + 1]) {
                    temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                    isSwapped = true;
                }

            }
           len --;
        } while(isSwapped);
    }
}