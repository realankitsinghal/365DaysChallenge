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

        int s=0;
        ListNode t=head;

        while(t!=null){
            t=t.next;
            s++;
        }

        int target=s-n;
        if (target == 0) {
            return head.next;
        }

        t = head;
        for (int i = 0; i < target - 1; i++) {
            t = t.next;
        }


        t.next = t.next.next;

        return head;
    }
}