public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length +1;
        int j = 0, sum = 0;
        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];//keep accumlating until the sum is greater than or queal to s
            while(sum >= s&& j <= i){// have to use less than or qual to i, to account for only one element
                //if(sum >= s) always going to be this condition when enter the while loop
                len = len <= i-j+1? len:i-j+1;
                sum -= nums[j++];
            }
        }
        return len == nums.length+1 ?0:len;// acount for the case that there are no valid subarray
    }
}