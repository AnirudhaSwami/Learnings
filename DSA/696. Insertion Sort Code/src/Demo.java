
public class Demo {
    public static void main(String[] args) {
        int[] nums = {8, 6, 5, 2, 3, 7};

        System.out.println("Before insertion sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        insertionSort(nums);
        System.out.println("\nAfter insertion sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    static void insertionSort(int[] nums) {
        int len = nums.length;
        int key = 0;
        for (int i = 1; i < len; i++) {
            key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;

        }
    }
}
