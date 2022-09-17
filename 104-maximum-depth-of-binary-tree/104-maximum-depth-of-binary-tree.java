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
    int maxlevel=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        helper(root,1);
        return maxlevel+1;
    }
    void helper(TreeNode root,int level){
        if(root==null) return;
        
        if(root.left!=null && level>maxlevel||root.right!=null && level>maxlevel){
            maxlevel = level;
        }
        helper(root.left,level+1);
        helper(root.right,level+1);
    }
}