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
    public ListNode sortList(ListNode head) {
         if(head==null||head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = head;
        ListNode temp = dummy;
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next ;
             fast = fast.next.next;
        }
        temp.next=null;
        ListNode left = sortList(head);
        ListNode right=  sortList(slow);
        return merge(left,right);
        
    }
    ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next= new ListNode(l1.val);
                l1 = l1.next;
                curr = curr.next;
            }else{
                curr.next= new ListNode(l2.val);
                l2 = l2.next;
                curr = curr.next;
            }
        }
        while(l1!=null){
             curr.next= new ListNode(l1.val);
                l1 = l1.next;
                curr = curr.next;
        }
        while(l2!=null){
             curr.next= new ListNode(l2.val);
                l2 = l2.next;
                curr = curr.next;
        }
        return dummy.next;
    }
}