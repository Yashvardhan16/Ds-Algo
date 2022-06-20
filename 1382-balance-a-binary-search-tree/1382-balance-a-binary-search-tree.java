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
    List<TreeNode> list = new ArrayList();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return ans(0,list.size()-1);
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    TreeNode ans(int start,int end){
        if(start>end) return null;
        int mid = start +(end-start)/2;
        TreeNode curr = list.get(mid);
        curr.left = ans(start,mid-1);
        curr.right = ans(mid+1,end);
        return curr;
    }
}