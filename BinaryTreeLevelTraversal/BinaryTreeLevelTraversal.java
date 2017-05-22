/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(root, 0, result);
        return result;
    }
    private void helper(TreeNode node, int lvl, List<List<Integer>> result){
        if(node == null)
            return;
        if(result.size() < lvl + 1) //determine whether an new arraylist should be created or not
            result.add(lvl, new ArrayList<Integer>());
        result.get(lvl).add(node.val);
        helper(node.left, lvl + 1, result);
        helper(node.right, lvl +1, result);
    }
}