// Last updated: 5/25/2026, 11:18:08 AM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1, head2=list2;
        ListNode dummy=new ListNode(-101), temp=dummy; //dummyVariable
        while(head1!=null && head2!= null) {
            if(head1.val<=head2.val) {
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else {
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
        //addingLeftout
        if(head1!=null) temp.next=head1;
        else temp.next=head2;
        return dummy.next;
    }
}