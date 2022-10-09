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
    TreeNode one=null,two=null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = one.val;
        one.val = two.val;
        two.val = temp;
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(one==null && prev.val>root.val){
            one = prev;
        }
         if(one!=null && prev.val>root.val){
            two = root;
        }
        prev = root;
        inorder(root.right);
    }
}