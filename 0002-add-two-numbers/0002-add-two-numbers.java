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
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int sum =0;
        while(l1!=null && l2!=null){
             sum += l1.val+l2.val;
            l1 = l1.next;
             l2 = l2.next;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            sum=sum/10;
            
           
        }
        
        while(l1!=null){
            sum+=l1.val;
            curr.next = new ListNode(sum%10);
            l1 = l1.next;
              curr = curr.next;
             sum=sum/10;
        }
         while(l2!=null){
             sum+=l2.val;
            curr.next = new ListNode(sum%10);
            l2 = l2.next;
               curr = curr.next;
              sum=sum/10;
        }
        if(sum>0){
            curr.next = new ListNode(sum%10);
        }
        return dummy.next;
    }
}