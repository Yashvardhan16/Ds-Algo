/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        
        
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean check(TreeNode root,Long min,Long max){
        if(root==null) return true;
        
        if(root.val<min||root.val>max) return false;
        
        return check(root.left,min,root.val-(long)1) && check(root.right,root.val+(long)1,max);
    }
}