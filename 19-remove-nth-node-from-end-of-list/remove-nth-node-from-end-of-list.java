/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(0, head);
        ListNode leftP = dummyNode;
        ListNode rightP = head;

        while (n != 0) {
            rightP = rightP.next;
            n--;
        }

        while (rightP != null) {
            leftP = leftP.next;
            rightP = rightP.next;
        }

        leftP.next = leftP.next.next;

        return dummyNode.next;
    }
}