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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return false;
        Queue<TreeNode> q = new LinkedList();
        boolean flag = false;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            if(curr.left!=null){
                if(flag==true) return false;
                q.add(curr.left);
            }else flag = true;
            
            if(curr.right!=null){
                if(flag==true) return false;
                q.add(curr.right);
            }else flag = true;
        }
        return true;
    }
}