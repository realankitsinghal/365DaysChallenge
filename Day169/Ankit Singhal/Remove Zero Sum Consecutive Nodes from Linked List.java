class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null) return head;
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode curr = head;
        int sum = 0;
        while(curr != null) {
            if(curr.val + sum == 0) temp.next = curr.next;
            sum += curr.val;
            curr = curr.next;
        }
        if(temp.next != null) temp.next.next = removeZeroSumSublists(temp.next.next);   
        return temp.next;
    }
}