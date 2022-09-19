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
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
    
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode level = q.poll();
                temp.add(level.val);
                if(level.left!=null){
                    q.add(level.left);
                }
                 if(level.right!=null){
                    q.add(level.right);
                }
            }
            list.add(new ArrayList(temp));
        }
    
            return list;
    }
}