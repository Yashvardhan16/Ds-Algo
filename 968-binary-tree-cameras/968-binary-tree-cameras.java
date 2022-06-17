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

    int cameracount = 0;
    int needscamera =0;
    int hascamera= 1;
    int covered = 2;
    int notneeded =3;
    public int minCameraCover(TreeNode root) {
        cameracount = getcameracount(root)==needscamera?cameracount+1:cameracount;
        return cameracount;
    }
    int getcameracount(TreeNode root){
        if(root==null){
            return notneeded;
        }
            
        if(root.left==null && root.right==null){
            return needscamera;
        }
        
        int l = getcameracount(root.left);
        int r = getcameracount(root.right);
        
        if(l==needscamera||r==needscamera){
            cameracount++;
            return hascamera;
        }
        if(l==hascamera||r==hascamera){
            return covered;
            
        }
        return needscamera;
    }
}