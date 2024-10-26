import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 11, 15,18,21};
        int target = 9;
        int arr2[] = twoSum(arr, target);
        System.out.println(Arrays.toString(arr2));
        int arr3[] = twoSum2(arr, target);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = Arrays.binarySearch(nums, nums[i]);
                    arr[1] = Arrays.binarySearch(nums, nums[j]);
                    if (Arrays.binarySearch(nums, nums[i]) == Arrays.binarySearch(nums, nums[j])) {
                        arr[0] = Arrays.binarySearch(nums, nums[i]);
                        arr[1] = Arrays.binarySearch(nums, nums[j]) + 1;
                    }
                }
            }
        }
        return arr;
    }
    public static int[] twoSum2(int[] nums, int target){
        int begin = 0;
        int end = nums.length-1;

        while (begin < end){
            int soma = nums[begin] + nums[end];
            if (soma == target) return new int []{begin, end};
            if (soma > target) end--;
            else begin++;
        }
        return new int[]{-1, -1};
    }
}
