class Solution {
    public void reorderList(ListNode head) {
        int n=0;
        Stack<ListNode> track=new Stack<>();
        ListNode temp=head;
        while(temp != null){
            track.push(temp); 
            temp=temp.next;
            n+=1; 
        }
        temp=head;
        for (int i=0; i<n/2;i++){
            ListNode str=temp.next;
            temp.next=track.peek(); 
            track.pop().next=str;
            temp=temp.next.next; 
        }
        temp.next = null;
    }
}