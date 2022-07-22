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
        ListNode before = new ListNode(0);
        ListNode beforehead = before;
        ListNode after = new ListNode(0);
        ListNode afterhead = after;
        while(head!=null){
            if(head.val<x){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        before.next = afterhead.next;
        after.next =null;
        return beforehead.next;
    }
}