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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k<=1) return head;
        int len =0;
        ListNode curr = head;
        while(curr!=null && len<k){
            curr = curr.next;
            len++;
        }
        
        if(len==k){
            curr = reverseKGroup(curr,k);
            
            while(len-->0){
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head =temp;
            }
            
            head = curr;
            System.out.println(curr.val);
        }
        return head;
        
    }
}