public class Demo {

    public static void main(String [] args){

        int[] nums = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73};

        int target = 43;
       /*
       int result = LinearSearch(nums, target);

        if (result !=-1)
            System.out.println("{LinearSearch} Number found at index : " + result);
        else
            System.out.println("{LinearSearch} Number is not found!");

        int result2 = BinarySearch(nums, target);

        if (result2 !=-1)
                System.out.println("{BinarySearch} Number found at index : " + result2);
        else
                System.out.println("{BinarySearch} Number is not found!");
        */

        int resultForRecursive = recursive_BinarySearch(nums, target, 0 , nums.length - 1);
        if (resultForRecursive !=-1)
            System.out.println("{recursive_BinarySearch} Number found at index : " + resultForRecursive);
        else
            System.out.println("{recursive_BinarySearch} Number is not found!");
    }

    public static int LinearSearch(int[] nums, int target) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            count ++;
            if(nums[i] == target){
                System.out.println("Steps in Linear Search : "+count);
                return i;
            }
        }

        System.out.println("Steps in Linear Search : "+count);

        return -1;
    }

    public static int BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int count = 0;

        while (start <= end) {
            count++;
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                System.out.println("Steps in Binary Search : " + count);
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        System.out.println("Steps in Binary Search : " + count);
        return -1;

    }

    public static int recursive_BinarySearch(int[] nums, int target, int start, int end) {
        int mid = ( start + end )/2 ;
        if(target == nums[mid]){
            return mid;
        } else if (nums[mid] < target) {
            return recursive_BinarySearch(nums, target, mid+1, end);
        } else {
            return recursive_BinarySearch(nums, target, start, mid-1);
        }
    }
}
