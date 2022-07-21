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
class Solution {
    public ListNode reverseBetween(ListNode head, int lo, int hi) {
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode left = dummy;
        ListNode prevleft = null;
        for(int i=1;i<=lo;i++){
            prevleft = left;
            left = left.next;
        }
        ListNode right = left;
        ListNode prevright = prevleft;
        
        for(int i=lo;i<=hi;i++){
            ListNode temp = right.next;
            right.next = prevright;
            prevright = right;
            right = temp;
        }
        prevleft.next =prevright;
        left.next = right;
        return dummy.next;
    }
}