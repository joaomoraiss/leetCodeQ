import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
        //System.out.println(containsDuplicate2(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++)if (nums[i] == nums[j]) result = true;
        }
        return result;
    }

}
