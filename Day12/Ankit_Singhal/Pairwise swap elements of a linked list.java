class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next == null) return head;
        Node curr = head.next;
        Node prev = head;
        head = curr;
        Node ne;
        while(curr!=null || curr.next!=null){
            ne = curr.next;
            curr.next = prev;
            if (ne == null || ne.next == null) {
            prev.next = ne;
            break;
            }
  
        // Change next of previous to next of next
        prev.next = ne.next;
  
        // Update previous and curr
        prev = ne;
        curr = prev.next;
    }
        return head;
    }
}