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
    PriorityQueue<Integer> list = new PriorityQueue();
    public int kthSmallest(TreeNode root, int k) {
         helper(root);
        for(int i=0;i<k-1;i++){
            list.poll();
        }
        return list.peek();
    }
    void helper(TreeNode root){
        if(root!=null){
        helper(root.left);
        list.add(root.val);
        helper(root.right);
        }
    }
}