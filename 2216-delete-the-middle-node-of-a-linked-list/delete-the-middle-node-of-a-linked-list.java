class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        list.remove(list.size() / 2);

        if (list.size() == 0)
            return null;

        ListNode newHead = new ListNode(list.get(0));
        temp = newHead;

        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }

        return newHead;
    }
}