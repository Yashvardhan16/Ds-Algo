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
    PriorityQueue<Integer> pq = new PriorityQueue();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        inorder(root);
        int ans =0;
        for(int i=0;i<k;i++){
           ans =pq.poll();
        }
        
        return ans;
    }
    void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            pq.add(root.val);
            inorder(root.right);
        }
    }
}