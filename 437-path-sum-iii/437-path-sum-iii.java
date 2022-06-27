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
    int count =0;
    public int pathSum(TreeNode root, int k) {
        if(root==null) return 0;
        helper(root,k);
        pathSum(root.left,k);
        pathSum(root.right,k);
        return count;
    }
    void helper(TreeNode root, int k){
        if(root==null) return;
        if(k==root.val) count++;
         k -= root.val;
        helper(root.left,k);
        helper(root.right,k);
    }
}