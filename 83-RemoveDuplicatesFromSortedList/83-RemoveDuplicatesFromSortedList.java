// Last updated: 7/9/2026, 9:16:35 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode curr = head;
        while(curr.next != null){
            if(curr.val == curr.next.val){
                curr.next=curr.next.next;
            }
            else
                curr=curr.next;
        }
       
        
         return head;
    }
}