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
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        int diff = Integer.MAX_VALUE;
       List<Integer> list = new ArrayList();
        while(pq.size()>0){
            list.add(pq.poll());
        }
        for(int i=1;i<list.size();i++){
            diff = Math.min(diff,list.get(i)-list.get(i-1));
        }
        return diff;
    }
    void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            pq.add(root.val);
            helper(root.right);
        }
    }
}