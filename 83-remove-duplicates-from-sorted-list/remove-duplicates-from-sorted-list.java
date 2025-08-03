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
        if (head == null)
            return null;
        ListNode currentElement = head;
        ListNode nextElement = head.next;

        if (nextElement == null)
            return head;

        while (currentElement != null && nextElement != null) {
            if (currentElement.val == nextElement.val) {
                currentElement.next = nextElement.next;
                nextElement = nextElement.next;
            } else {
                currentElement = currentElement.next;
                nextElement = nextElement.next;
            }
        }

        return head;
    }
}