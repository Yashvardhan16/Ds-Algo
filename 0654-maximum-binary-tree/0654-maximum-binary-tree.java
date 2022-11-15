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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int[] nums,int start,int end){
        if(start>end) return null;
        int max =Integer.MIN_VALUE;
        int index =-1;
        
        for(int i=start;i<=end;i++){
            if(max<nums[i]){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = helper(nums,start,index-1);
        root.right = helper(nums,index+1,end);
        return root;
        
    }
}