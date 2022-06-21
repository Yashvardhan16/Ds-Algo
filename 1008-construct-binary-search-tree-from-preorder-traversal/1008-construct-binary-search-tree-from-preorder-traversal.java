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
    int index =0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
     TreeNode helper(int[] nums ,int min,int max){
    if(index>nums.length-1 || nums[index]<min || nums[index]>max) return null;
    
    int val = nums[index];
    index++;
    
    TreeNode node = new TreeNode(val);
   node.left =  helper(nums,min,val);
     node.right =  helper(nums,val,max);
     return node;
}
}