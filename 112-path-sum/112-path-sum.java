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
    public boolean hasPathSum(TreeNode root, int target) {
       if(root==null) return false;
        
       return helper(root,target);
    }
    boolean helper(TreeNode root, int target){
        if(root==null) return false;
        target-=root.val;
        System.out.println(target);
        if(0==target && root.left==null && root.right==null){
            return true;
        }
        return helper(root.left,target) || helper(root.right,target);
    }
}