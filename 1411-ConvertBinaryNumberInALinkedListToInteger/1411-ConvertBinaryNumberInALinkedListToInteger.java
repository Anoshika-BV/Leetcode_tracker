// Last updated: 7/9/2026, 9:14:51 AM
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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode curr = head;
        while(curr != null){
            res = res*2 +curr.val;
            curr = curr.next;
        }
        return res;
    }
}