/*public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer> ();
        helper(nums, 0, nums.length, rst, tmp);
        return rst;
    }
    private void helper(int[] nums, int pos, int size, ArrayList<List<Integer>> rst, ArrayList<Integer> tmp){
        rst.add(new ArrayList<Integer>(tmp));
        for(int i = pos; i < size; i++){
            tmp.add(nums[i]);
            helper(nums, i+1, size, rst, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}*/

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(cur,rst,0, nums);
        return rst;
    }
    private void helper (ArrayList<Integer> cur, ArrayList<List<Integer>> rst, int index, int[] nums){
        rst.add(new ArrayList<Integer>(cur));
        for(int i = index; i < nums.length; i ++){
            cur.add(nums[i]);
            helper(cur, rst, i+1, nums);
            cur.remove(cur.size() - 1);
        }
    }
    
}
