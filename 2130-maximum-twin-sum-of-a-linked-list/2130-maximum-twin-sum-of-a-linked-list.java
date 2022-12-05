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
    public int pairSum(ListNode head) {
        if(head==null||head.next==null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
        }
        
         slow = reverse(slow);
        fast = head;
        int max =Integer.MIN_VALUE;
        while(slow!=null){
            max = Math.max(max,fast.val+slow.val);
            fast = fast.next;
            slow = slow.next;
        }
        return max;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}