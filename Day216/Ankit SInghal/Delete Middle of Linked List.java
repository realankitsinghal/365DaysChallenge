class Solution {
    Node deleteMid(Node head) {
        if(head==null || head.next==null) return null;
        Node slow=head,fast=head,pre=new Node(-1);
        pre.next=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            pre=pre.next;
        }
        pre.next=slow.next;
        return head;
    }
}