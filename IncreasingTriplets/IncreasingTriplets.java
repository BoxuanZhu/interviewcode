public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int x : nums){
            if(x <= a)
                a = x;
            else if(x <= b)
                b = x;
            else
                return true;
        }
        return false;
    }
}