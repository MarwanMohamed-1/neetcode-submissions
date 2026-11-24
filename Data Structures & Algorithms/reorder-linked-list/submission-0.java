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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedList = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = reversedList;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode first = head;
        reversedList = prev;
        while (reversedList != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = reversedList.next;

            first.next = reversedList;
            reversedList.next = temp1;

            first = temp1;
            reversedList = temp2;
        }

    }
}
