

import javax.smartcardio.Card;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_node = new ListNode();
        ListNode cursor = dummy_node;
        int carry = 0;
        // int total = 0;

        while(l1 != null || l2 != null || carry > 0) {
            int v1 = 0;
            int v2 = 0;
             
            if (l1 != null){
                v1 = l1.val;
            }

            if (l2 != null){
                v2 = l2.val;
            }
            
            int total = v1 + v2 + carry; 
            carry = total / 10;
            int actual_node_val = total % 10;
            cursor.next = new ListNode(actual_node_val);

            // Update pointers
            cursor = cursor.next;
            if (l1 != null){
               l1 = l1.next;
            }

            if (l2 != null){
               l2 = l2.next;
            }
        }

    return dummy_node.next;       
    }
}