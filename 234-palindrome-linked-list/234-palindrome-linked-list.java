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
        Stack<Integer> st = new Stack();
        ListNode curr = head;
        ListNode prev = head;
        while(curr!=null){
            st.add(curr.val);
            curr = curr.next;
        }
        
        while(!st.isEmpty()){
            if(st.pop()!=prev.val){
                return false;
            }
            prev = prev.next;
        }
        return true;
    }
}