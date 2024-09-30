import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,3,3,4,3,2,4,2,4};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate2(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++)if (nums[i] == nums[j]) result = true;
        }
        return result;
    }
    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
    public static boolean containsDuplicate3(int[] nums) {
        Set<Integer> uniqueNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        return uniqueNums.size() < nums.length;
    }
    public static boolean containsDuplicate4(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num -> !seen.add(num));
    }
}
