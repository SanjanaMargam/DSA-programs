class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Find length
        int n = 0;
        ListNode ptr = head;

        while (ptr != null) {
            n++;
            ptr = ptr.next;
        }

        // Find start of second half
        ptr = head;

        for (int i = 1; i < (n + 1) / 2; i++) {
            ptr = ptr.next;
        }

        // ptr is the last node of first half
        ListNode second = ptr.next;
        ptr.next = null;

        // Reverse second half
        second = reverse(second);

        // Merge alternately
        ListNode first = head;

        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }

    ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
