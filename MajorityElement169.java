import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        int maisRepetido = 0;
        int elementoMaior = 0;
        for(int i = 0; i < nums.length; i++){
            majority.put(nums[i], majority.containsKey(nums[i]) ? majority.get(nums[i]) + 1 : 1);
        }
        for (int key : majority.keySet()){
            if (majority.get(key) > maisRepetido){
                maisRepetido = majority.get(key);
                elementoMaior = key;
            }
        }
        return elementoMaior;
    }
}
