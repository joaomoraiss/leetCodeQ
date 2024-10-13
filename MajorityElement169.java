import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,1,2,2,5};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement3(nums));
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
    public static int majorityElement2(int[] nums) {
        int qntdVezes = 0;
        int canditado = 0;

        for (int num : nums){
            if (qntdVezes == 0 )canditado = num;
            if (num == canditado) qntdVezes++;
            else qntdVezes --;
        }
        return canditado;
    }
    public static int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
