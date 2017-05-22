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
    public boolean isValidBST(TreeNode root) {
        boolean left = true;
        boolean right = true;
        if(root == null)
            return true;
        if(root.left != null)
            left = root.val > find_max(root.left);
        if(root.right != null)
            right = root.val < find_min(root.right);
        return isValidBST(root.right)&&isValidBST(root.left)&&left&&right;
    }
    private int find_max(TreeNode cur){
        if(cur.right == null)
            return cur.val;
        else
            return find_max(cur.right);

    }
    private int find_min(TreeNode cur){
        if(cur.left == null)
            return cur.val;
        else
            return find_max(cur.left);
    }
}