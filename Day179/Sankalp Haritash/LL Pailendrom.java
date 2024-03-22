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

    public static ListNode R(ListNode head){
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        if (f != null) {
            s = s.next;
        }

        ListNode secondHalf = R(s);
        ListNode firstHalf = head;

        // Compare the first half and the reversed second half
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}