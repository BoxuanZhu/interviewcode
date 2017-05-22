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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        String result;
        if(root != null){
            result = ""+root.val;
            if(root.left != null )
                inorder(root.left, result, list);
            if(root.right != null)
                inorder(root.right,result,list);
            if(root.left == null && root.right == null)
                list.add(result);
        }
        return list;
    }
    private void inorder(TreeNode node, String result, ArrayList<String> list){
        result = result + "->" + node.val;
        if(node.left == null && node.right == null){
            list.add(result);
        }
        if(node.left != null )
            inorder(node.left, result, list);
        if(node.right != null)
            inorder(node.right, result, list);
    } 
    
}