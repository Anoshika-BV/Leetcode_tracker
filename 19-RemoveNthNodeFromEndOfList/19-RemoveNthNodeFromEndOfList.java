// Last updated: 7/9/2026, 9:17:10 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }

        ListNode dummynode=new ListNode(0);
        dummynode.next=head;
        ListNode slow=dummynode,fast=dummynode;
    
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummynode.next;
    }
}