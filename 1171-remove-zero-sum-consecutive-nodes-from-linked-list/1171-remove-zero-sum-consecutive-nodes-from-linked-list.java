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
    public ListNode removeZeroSumSublists(ListNode head) {
         if(head==null) return head;
      int sum =0;
        ListNode curr =head;
        while(curr!=null){
            sum+=curr.val;
            if(sum==0) break;
            curr = curr.next;
        }
        if(curr!=null) return removeZeroSumSublists(curr.next);
        head.next = removeZeroSumSublists(head.next);
        return head;
    }
}