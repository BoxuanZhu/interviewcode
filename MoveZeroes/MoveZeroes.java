public class Solution {
    public void moveZeroes(int[] nums) {
        int cur = 0;
        int temp;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i]!= 0){
                temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}