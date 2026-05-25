// Last updated: 5/25/2026, 11:15:36 AM
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
    public boolean isPalindrome(ListNode head) {
        ListNode prev =null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode SecondHalf = reverse(slow);
        ListNode FirstHalf = head;

        while(SecondHalf != null){
            if(FirstHalf.val != SecondHalf.val){
                return false;
            }
            FirstHalf = FirstHalf.next;
            SecondHalf = SecondHalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
