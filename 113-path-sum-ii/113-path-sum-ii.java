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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        
          if(root==null) return list;
        List<Integer> res = new LinkedList<Integer>();
        helper(root,targetSum,list,res);
        return list;
    }
    void helper(TreeNode root,int target, List<List<Integer>> list ,List<Integer> res){
        if(root==null) return;
        res.add(new Integer(root.val));
        
        if(root.left==null && root.right==null && target==root.val){
            list.add(new LinkedList<>(res));
            res.remove(res.size()-1);
            return;
        }else{
            helper(root.left,target-root.val,list,res);
             helper(root.right,target-root.val,list,res);
        }
         res.remove(res.size()-1);
    }
}