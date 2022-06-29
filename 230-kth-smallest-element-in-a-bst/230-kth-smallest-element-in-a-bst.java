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
         helper(root,k);
        int ans =0;
        for(int i=0;i<k;i++){
            ans = list.poll();
        }
        return ans;
    }
    void helper(TreeNode root,int k){
        if(root!=null){
        helper(root.left,k);
        list.add(root.val);
        helper(root.right,k);
        }
    }
}