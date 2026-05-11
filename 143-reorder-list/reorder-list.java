class Solution {

    public void reorderList(ListNode head) {

        if(head == null || head.next == null) {
            return;
        }

        ListNode prev = null;
        ListNode cur = head;

        while(cur.next != null) {
            prev = cur;
            cur = cur.next;
        }

        if(head == prev) {
            return;
        }

        prev.next = null;

        ListNode nextNode = head.next;

        head.next = cur;
        cur.next = nextNode;

        reorderList(nextNode);
    }
}