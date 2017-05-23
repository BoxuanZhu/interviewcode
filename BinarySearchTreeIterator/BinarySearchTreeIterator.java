/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//always push to stack till there is no more left child. when poped the from the stack, add all the right child of the current node.
public class BSTIterator {
    private static Stack<TreeNode> stack  = new Stack<TreeNode> ();// use a stack to do in order traversal
    private TreeNode next = null;
    private void addToStack (TreeNode node){
        while(node!= null){
            stack.push(node);
            node = node.left;
        }
    }
    public BSTIterator(TreeNode root) {
        next = root;//next is used to only track what should be added to stack
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(next != null){
            addToStack(next);
            next = null;
        }
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if(!hasNext()){
            return -1;
        }
        TreeNode cur = stack.pop();
        next = cur.right;
        return cur.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */