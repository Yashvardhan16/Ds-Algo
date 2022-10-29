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
        ListNode beforehead = new ListNode();
        ListNode before = beforehead;
        ListNode afterhead = new ListNode();
        ListNode after  = afterhead;
        while(head!=null){
            if(head.val<x){
                before.next =head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        before.next = afterhead.next;
        after.next=null;
        return beforehead.next;
        
    }
}