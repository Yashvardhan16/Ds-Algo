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
            List<List<Integer>> list = new ArrayList();

        if(root==null) return list;
        LinkedList<Integer> res = new LinkedList();
        helper(root,targetSum,res,list);
        return list;
    }
    
    void helper(TreeNode root,int target , LinkedList<Integer> res,List<List<Integer>> list){
        if(root==null) return;
        
        res.add(root.val);
        if(root.left==null && root.right==null && target==root.val){
            list.add(new ArrayList(res));
            res.remove(res.size()-1);
            return;
        }else{
            helper(root.left,target-root.val,res,list);
             helper(root.right,target-root.val,res,list);
        }
        res.remove(res.size()-1);
    }
}