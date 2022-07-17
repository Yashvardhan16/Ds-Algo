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
    public void reorderList(ListNode head) {
        ListNode[] left = new ListNode[1];
        left[0] = head;
        reorder(left,head);
    }
    void reorder(ListNode[] left, ListNode right){
        if(right==null) return;
        
        reorder(left,right.next);
        if(left[0].next!=null){
            ListNode leftnext = left[0].next ;
            left[0].next = right;
            right.next = leftnext;
            left[0] = leftnext;
            
        }
        
        if(left[0].next==right){
            left[0].next=null;
        }
    }
}