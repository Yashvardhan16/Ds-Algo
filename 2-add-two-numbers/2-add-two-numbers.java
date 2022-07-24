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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode prev = ans;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            if(l1!=null){
                carry+=l1.val; 
                    l1 = l1.next;
            }
            if(l2!=null){
                carry+=l2.val; 
                    l2 = l2.next;
            }
            prev.next = new ListNode(carry%10);
            carry /=10;
            prev = prev.next;
        }
        return ans.next;
    }
}