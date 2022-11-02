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
    public ListNode rotateRight(ListNode A, int k) {
        if(A==null||A.next==null) return A;
        ListNode curr = A;
        int len =1;
        while(curr!=null && curr.next!=null){
            curr = curr.next;
            len++;
        }
        curr.next = A;
        k%=len;
        k = len-k;
        while(k>0){
            curr = curr.next;
            k--;
        }
        A=curr.next;
        curr.next=null;
        return A;
    }
}