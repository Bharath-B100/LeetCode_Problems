// Last updated: 6/15/2026, 10:31:32 PM
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
12    public int pairSum(ListNode head) {
13        ListNode prev = null;
14        ListNode slow = head;
15        ListNode fast = head;
16
17        while(fast!= null){
18            prev = slow;
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        ListNode tempX = slow;
23        while(slow != null){
24            ListNode temp = slow.next;
25            slow.next = prev;
26            prev = slow;
27            slow = temp;
28        }
29        int max = Integer.MIN_VALUE;
30            while(head!=tempX){
31            max = Math.max(max, head.val+prev.val);
32            prev = prev.next;
33            head = head.next;
34        }
35        return max;
36    }
37}