/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(slow!=dummy){
                    slow = slow.next;
                    dummy=dummy.next;
                }
                return dummy;
            }
            
        }
        return null;
    }
}