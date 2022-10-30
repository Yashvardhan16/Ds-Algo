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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(ListNode curr:lists){
            while(curr!=null){
                pq.add(curr.val);
                curr = curr.next;
            }
        }
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while(pq.size()>0){
            ans.next = new ListNode(pq.poll());
            ans = ans.next;
        }
        return dummy.next;
    }
}