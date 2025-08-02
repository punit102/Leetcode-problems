/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slowP = head;
        ListNode fastP = head;
        boolean result = false;
        
        while(fastP != null && fastP.next != null ) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (slowP == fastP) {
                result = true;
                break;
            }
        }
        return result;
    }
}