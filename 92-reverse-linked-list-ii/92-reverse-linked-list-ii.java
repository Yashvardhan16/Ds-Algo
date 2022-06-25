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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode l = dummy;
        ListNode prevleft =null;
        
        for(int i=1;i<=left;i++){
            prevleft = l;
            l = l.next;
        }
        ListNode r = l;
            ListNode prevright = prevleft;
        
        for(int i=left;i<=right;i++){
            ListNode temp = r.next;
            r.next = prevright;
            prevright = r;
            r = temp;
        }
        prevleft.next = prevright;
        l.next = r;
        return dummy.next;
    }
}