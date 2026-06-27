class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Remove first node
        if (count == n)
            return head.next;

        int pos = count - n;

        ListNode curr = head;

        for (int i = 1; i < pos; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}