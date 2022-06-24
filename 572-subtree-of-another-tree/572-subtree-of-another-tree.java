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
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if(root==null||sub==null) return false;
        if(root==sub) return true;
        if(dfs(root,sub)) return true;
        return isSubtree(root.left,sub)||isSubtree(root.right,sub);
        
    }
    boolean dfs(TreeNode root, TreeNode sub){
        if(root==sub) return true;
         if(root==null||sub==null) return false;

        if(sub.val!=root.val) return false;
        
        return dfs(root.left,sub.left) && dfs(root.right,sub.right);
        
    }
}