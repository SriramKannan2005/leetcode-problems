class Solution {

    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        ArrayList<Integer> rev = new ArrayList<>(list);

        Collections.reverse(rev);

        return list.equals(rev);
    }
}