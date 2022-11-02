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
    public ListNode deleteDuplicates(ListNode A) {
        ListNode curr = A;
        ListNode dummy = new ListNode();
        dummy.next=A;
        ListNode ans = dummy;
        while(curr!=null && curr.next!=null){
            if(curr.next!=null && curr.val == curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr = curr.next;
                }
                ans.next = curr.next;
            }else{
            ans = ans.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}