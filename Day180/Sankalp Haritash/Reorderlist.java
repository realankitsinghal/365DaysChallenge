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
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;

        ListNode m=middleNode(head);
        ListNode hs=reverseList(m);
        ListNode hf=head;

        while(hf!=null && hs!=null)
        {
            ListNode t=hf.next;
            hf.next=hs;
            hf=t;

            t=hs.next;
            hs.next=hf;
            hs=t;
        }

        if(hf!=null)
            hf.next=null;

    }
}