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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p=null,t=list1;

        for (int i = 0; i < a; i++) {
            p = t;
            t = t.next;
        }

        // Traverse list1 until reaching the node at position b
        for (int i = a; i <= b; i++) {
            t = t.next;
        }

        if(list2!=null){
            ListNode t1=list2;
            while(t1.next!=null){
                t1=t1.next;
            }

            p.next=list2;
            t1.next=t;
        }

        return list1;
    }
}