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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      int len = inorder.length;
        return helper(preorder,inorder,0,len-1,0,len-1);
        
    }
    
    TreeNode helper(int[] preorder, int[] inorder,int ps,int pe,int is,int ie){
        if(ps>pe) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        if(ps==pe) return root;
        
        for(int i=is;i<=ie;i++){
            if(root.val==inorder[i]){
        root.left = helper(preorder,inorder,ps+1,ps+i-is,is,i-1);
         root.right = helper(preorder,inorder,ps+i-is+1,pe,i+1,ie);

                break;
            }
        }
        return root;
    }
}