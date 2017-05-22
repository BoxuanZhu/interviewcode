public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(cur, rst, 0, nums);
        return rst;
    }
    
    
    //get the subset of each element, if duplicate, then don't get the subset of that duplicate element
    private void helper(ArrayList<Integer> cur, ArrayList<List<Integer>> rst, int index, int[] nums){
        rst.add(new ArrayList<Integer>(cur));
        for(int i = index; i < nums.length; i ++){
            if(i != index && nums[i] == nums[i -1])
                continue;
            cur.add(nums[i]);
            helper(cur, rst, i+1, nums);
            cur.remove(cur.size()-1);
        }
    }
}