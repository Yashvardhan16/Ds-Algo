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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s = null;
        ListNode f= head;
        ListNode curr =head;
        for(int i=1;i<k;i++){
            head = head.next;
            
        }
        s = head;
        while(head.next!=null){
            f = f.next;
            head = head.next;
        }
        
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
        
        return curr;
    }
}