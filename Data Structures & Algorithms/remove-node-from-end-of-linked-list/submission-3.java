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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy=head;
int c=0;


        while(dummy!=null){
            c++;
            dummy=dummy.next;
        }
if(c==n) return head.next;
        
        int res=(c-n)+1;
System.out.println(res);
        ListNode prev=head;
        ListNode curr=head;
        while(res!=1){
 prev=curr;
            curr=curr.next;
           
            res--;
            System.out.println(res);


        }

        prev.next=curr.next;
        curr=null;


        return head;

    }
}
