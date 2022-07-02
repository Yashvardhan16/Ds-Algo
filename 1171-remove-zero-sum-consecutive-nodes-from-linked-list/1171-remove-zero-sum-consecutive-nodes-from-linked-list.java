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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null) return head;
         Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = head;
        int sum =0;
        while(dummy!=null){
            sum+=dummy.val;
            if(sum==0){
                head = dummy.next;
            }
            if(map.containsKey(sum)){
                map.get(sum).next = dummy.next;
                return removeZeroSumSublists(head);
            }
            map.put(sum,dummy);
            dummy= dummy.next;
        }
        return head;
    }
}