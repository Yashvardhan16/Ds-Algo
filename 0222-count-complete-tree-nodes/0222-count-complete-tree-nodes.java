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
    int count =0;
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
       Stack<TreeNode> st = new Stack();
        st.add(root);
        int count =0;
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            count++;
            if(temp.left!=null){
                st.add(temp.left);
            }
             if(temp.right!=null){
                st.add(temp.right);
            }
            
        }
        return count;
    }
}