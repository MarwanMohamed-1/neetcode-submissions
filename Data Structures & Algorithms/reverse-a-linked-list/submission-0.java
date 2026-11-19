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
    public ListNode reverseList(ListNode head) {
         ListNode curr = head;
    ListNode prev = null;
    while(curr != null ){
        ListNode next = curr.next; //save next node

        curr.next = prev; // point the direction to prev node
        prev = curr; //move the prev to the next node which is current
        curr = next;
    }
    return prev;
    }
}
