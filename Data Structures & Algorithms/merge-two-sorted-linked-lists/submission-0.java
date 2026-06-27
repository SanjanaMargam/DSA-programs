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
    public ListNode mergeTwoLists(ListNode p, ListNode q) {

        ListNode head=new ListNode(-1);

        ListNode dummy=head;


        while(p!=null && q!=null){

            if(p.val <=q.val){
                head.next=p;
                p=p.next;
            }
            else{
                head.next=q;
                q=q.next;
            }

            head=head.next;

        }

        while(p!=null){
            head.next=p;
            p=p.next;
            head=head.next;
        }

        while(q!=null){
            head.next=q;
            q=q.next;
            head=head.next;
        }


        return dummy.next;
    

        
        
    }
}