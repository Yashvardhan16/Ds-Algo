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
    List<Integer> list = new ArrayList();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        helper(root);
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<list.size();i++){
            if(map.containsKey(k-list.get(i))){
                return true;
            }else{
               map.put(list.get(i),map.getOrDefault(list.get(i),0)+1); 
            }
        }
        return false;
        
    }
    void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            list.add(root.val);
            
            helper(root.right);
        }
    }
}