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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode curr =head;
        Stack<Integer> st = new Stack();
        while(curr!=null){
            st.push(curr.val);
            curr=curr.next;
        }
        
        while(!st.isEmpty()){
            if(st.pop()!=head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}