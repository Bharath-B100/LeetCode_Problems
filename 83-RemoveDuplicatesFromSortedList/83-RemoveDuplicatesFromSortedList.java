// Last updated: 5/25/2026, 11:17:12 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
    // temp ooda nxt null ah illa na & prev & next = ah nu paakanum
            if (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
//easy da- Dec month ooda notes la check panniko