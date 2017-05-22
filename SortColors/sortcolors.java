public class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;// keep track of numbers of appearance of red white and blue
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0)
                red ++;
            else if(nums[i] == 2)
                blue ++;
            else
                white++;
        }
        int pos = 0;
        while(red-- > 0)
            nums[pos ++] = 0;
        while(white-- >0)
            nums[pos ++] = 1;
        while(blue-- > 0)
            nums[pos++] = 2;
    }
}