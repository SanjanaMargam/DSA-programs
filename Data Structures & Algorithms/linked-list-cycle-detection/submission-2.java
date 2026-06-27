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
    public boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
if (head==null) return false;

if(fast.next==null || fast.next.next==null) return false;
    else
    fast=fast.next.next;

    if(slow.next==null) return false;

    else slow=slow.next;
        while(slow!=fast){

            if(slow.next==null || fast.next==null || fast.next.next==null) return false;

            slow=slow.next;
            fast=fast.next.next;

           
        }

        return true;
        
    }
}
