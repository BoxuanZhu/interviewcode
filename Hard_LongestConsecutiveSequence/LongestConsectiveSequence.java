public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        //add all the num into a set
        for(int num: nums)
            set.add(num);
        int maxLen = 0;
        //for each of the num in nums, see if there consecutive number
        for(int num: nums){
            int cur = num;
            int curLen = 0;//keep track of the current Length
            while(set.contains(cur)){//count all the numbers after cur
                set.remove(cur);
                cur++;
                curLen++;
                
            }
            cur = num -1;
            while(set.contains(cur)){//count all the numbers before cur
                set.remove(cur);
                cur --;
                curLen++;
            }
            maxLen = Math.max(maxLen, curLen);//update global max
        }
        return maxLen;
    }
}