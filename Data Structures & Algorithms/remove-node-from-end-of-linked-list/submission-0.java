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
// 1 2 3 4 5 6 7
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int index = size - n;

        if (index == 0) { // removing the head
            return head.next;
        }

        curr = head;
        for (int i = 0; i < index - 1; i++) { // stop BEFORE the node to delete
            curr = curr.next;
        }
        curr.next = curr.next.next; // skip the node

        return head;
    }
}
