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

    public ListNode oddEvenList(ListNode head) {
        if (head==null||head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode nextnode=head.next;
        ListNode newnode=nextnode;
        while(nextnode!=null&&nextnode.next!=null)
        {
            curr.next=nextnode.next;
            curr=curr.next;
            nextnode.next=curr.next;
            nextnode=nextnode.next;
        }
        curr.next=newnode;
        return head;


    }
}