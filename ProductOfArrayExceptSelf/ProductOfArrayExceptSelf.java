public class Solution {
    public int[] productExceptSelf(int[] nums) {
     int len = nums.length;
     int[] rst = new int [len];
     rst[0] = nums[0];
     rst[len -1] = nums[len -1];
     for(int i = 1; i < len -1; i ++){
         rst[i] = nums[i] * rst[i-1];
     }
     int back =rst[len-2];
     int cur = nums[len-1];
     
     for(int i = len-2; i > 0; i --){
         rst[i] = cur * rst[i -1];
         cur = cur *nums[i];
     }
     rst[len -1] = back;
     rst[0] = cur;
     return rst;
    }
}