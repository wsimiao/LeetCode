/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int sum = 0;
        int carry = 0;
        int remaider = 0;
        while (l1 != null || l2 != null || carry != 0) {
            sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            remaider = sum % 10;
            ListNode cur = new ListNode(remaider);
            result.next = cur;
            result = result.next;
            carry = sum / 10;
            l1 = (l1==null) ? null : l1.next;
            l2 = (l2==null) ? null : l2.next;
        }
        return head.next;
    }
}