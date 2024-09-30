import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,2,3,3};
        System.out.println(removeElement(arr, 3));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        int valOccorurrence = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[valOccorurrence] = nums[i];
                valOccorurrence++;
            }
        }
        return valOccorurrence;
    }
}
