import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {
    public static void main(String[] args) {

    }
    public static int  removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static int removeDuplicates2(int[] nums) {
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < uniqueNums.length; i++) nums[i] = uniqueNums[i];
        return uniqueNums.length;
    }
}
