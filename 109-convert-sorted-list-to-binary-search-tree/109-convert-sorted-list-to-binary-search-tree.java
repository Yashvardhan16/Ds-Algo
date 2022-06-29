/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return helper(head,null);
    }
    TreeNode helper(ListNode head,ListNode end){
        
        ListNode slow = head;
        ListNode fast = head;
        if(slow==end) return null;
        while(fast!=end && fast.next!=end){
            slow = slow.next;
         fast = fast.next.next;
        }
        ListNode mid = slow;
        TreeNode root = new TreeNode(mid.val);
        root.left = helper(head,mid);
        root.right = helper(mid.next,end);
        return root;
    }
}