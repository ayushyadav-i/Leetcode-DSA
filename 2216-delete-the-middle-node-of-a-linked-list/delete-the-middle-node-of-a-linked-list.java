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
        if (head == null || head.next == null) {
            return null;
        } 
        ListNode sp = head;
        ListNode fp = head;
        ListNode cur = sp;   
        while (fp.next != null) {
            if (fp.next.next == null) {
                fp = fp.next;
            } else {
                fp = fp.next.next;
            }
            cur = sp;
            sp = sp.next;
        } 
        cur.next = sp.next;
        return head;
    }
}