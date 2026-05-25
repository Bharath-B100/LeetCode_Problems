// Last updated: 5/25/2026, 11:15:56 AM
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; 
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
