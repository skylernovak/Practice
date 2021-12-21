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
    public ListNode deleteMiddle(ListNode head) {
        // return head of list
        // get length of list
        // iterate to middle - 1
        //  next = next.next
        ListNode fastPtr = head;    // length of list
        ListNode targetPtr = head;    // middle of list
        ListNode slowPtr = null;
        ListNode curr = head;
        boolean even = true;
        if (head.next == null)
            return null;
        while (fastPtr.next != null) {
            fastPtr = fastPtr.next;
            if (even) {
                slowPtr = targetPtr;
                targetPtr = targetPtr.next;
                even = false;
            } else {
                even = true;
            }
        }
        slowPtr.next = targetPtr.next;
        
        return head;
    }
}