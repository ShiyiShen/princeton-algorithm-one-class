import java.lang.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(getHeight(root, 0) == -1){
            return false;
        }
        return true;
    }
    
    private int getHeight(TreeNode node, int i){
        
        if(node == null)
            return 0;
            
        int left = getHeight(node.left, i);
        int right = getHeight(node.right, i);
        
        if(Math.abs(left-right) > 1 || left == -1 || right == -1)
            return -1;
        
        //get max as tree height
        return Math.max(left, right) + 1;
    }
}