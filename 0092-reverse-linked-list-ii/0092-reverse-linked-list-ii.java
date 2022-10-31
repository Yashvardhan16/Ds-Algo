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
        ListNode curr = new ListNode(-1);
        curr.next=head;
        ListNode slow = curr;
         ListNode temp = null;
        for(int i=0;i<left;i++){
            temp = slow;
            slow = slow.next;
        }
        ListNode fast = slow;
        ListNode prevright = temp;
        for(int i=left;i<=right;i++){
            ListNode a = fast.next;
            fast.next = prevright;
            prevright = fast;
            fast = a;
        }
        temp.next =prevright;
        slow.next = fast;
        return curr.next;
        
    }
}