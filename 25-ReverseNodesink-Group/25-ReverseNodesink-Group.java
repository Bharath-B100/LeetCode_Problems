// Last updated: 5/25/2026, 7:01:26 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode curr = head;
14        int count = 0;
15        while (curr != null && count < k) {
16            curr = curr.next;
17            count++;
18        }
19        if (count < k) return head;
20        curr = head;
21        ListNode prev = null, next = null;
22        count = 0;
23        while (curr != null && count < k) {
24            next = curr.next;
25            curr.next = prev;
26            prev = curr;
27            curr = next;
28            count++;
29        }
30        head.next = reverseKGroup(curr, k);
31        return prev;
32    }
33}
34