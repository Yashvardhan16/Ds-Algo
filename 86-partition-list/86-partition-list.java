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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(-1);
        ListNode beforehead = before;
        ListNode after = new ListNode(-1);
        ListNode afterhead = after;
        
        while(head!=null){
            if(head.val>=x){
                after.next =head;
                after = after.next;
            }else{
                before.next = head;
                before = before.next;
            }
            head = head.next;
        }
        after.next=null;
        before.next=afterhead.next;
        return beforehead.next;
    }
}