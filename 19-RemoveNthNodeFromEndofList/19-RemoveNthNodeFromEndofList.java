// Last updated: 5/25/2026, 7:01:17 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        if(head==null){
14            return null;
15        }
16        ListNode slow= head;
17        ListNode fast= head;
18
19        for(int i =0;i<n;i++){
20            fast=fast.next;
21        }
22        if(fast==null){
23            return head.next;
24        }
25        while(fast.next!=null){
26            slow= slow.next;
27            fast= fast.next;
28        } 
29        slow.next=slow.next.next;
30        return head;
31    }
32}