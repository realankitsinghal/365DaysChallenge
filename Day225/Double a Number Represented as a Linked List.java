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
    public ListNode doubleIt(ListNode head) {
        if(head == null){
            return null;
        }
        int carry[]=new int[1];
        doubleit(head,carry);
        if(carry[0] != 0){
            ListNode x=new ListNode(carry[0]);
            x.next=head;
            return x;
        }
        else
            return head;
    }
    void doubleit(ListNode head,int carry[]){
        if(head==null)
            return;
        doubleit(head.next,carry);
        int ans=head.val*2 + carry[0];
        if(ans >=10){
            head.val=ans%10;
            carry[0]=ans/10;
        }
        else{
            head.val=2*head.val+carry[0];
            carry[0]=0;
        }
    }
}