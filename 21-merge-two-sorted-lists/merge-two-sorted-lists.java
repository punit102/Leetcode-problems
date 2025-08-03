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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode head, current;
        if (cur1.val < cur2.val) {
            head = cur1;
            cur1 = cur1.next;
            current = head;

        } else {
            head = cur2;
            cur2 = cur2.next;
            current = head;
        }

        while (cur1 != null && cur2 != null){
            if (cur1.val < cur2.val) {
                current.next = cur1;
                current = current.next;
                cur1 = cur1.next;

            } else {
                current.next = cur2;
                current = current.next;
                cur2 = cur2.next;
            }
        }

        if (cur1 != null) {
            current.next = cur1;
        }

        if (cur2 != null) {
            current.next = cur2;
        }
        return head;
        
    }
}