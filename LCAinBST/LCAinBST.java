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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp;
        if(p.val < q.val){
            temp = p;
            p = q;
            q = temp;
        }
        if(root == null || p == root || q == root)
            return root;
        if(p.val > root.val && q.val < root.val)
            return root;
        else if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p , q);
        else
            return lowestCommonAncestor(root.left, p , q);
    }
}