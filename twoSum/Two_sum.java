import java.util.*;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size = nums.length;
        int [] result = new int[2];
        for(int i = 0; i < size - 1; i ++){
            map.put(target - nums[i], i);
        }
        for(int i = 0; i < size; i ++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) != i){
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            }
        }
        Arrays.sort(result);
        return result;
    }
}