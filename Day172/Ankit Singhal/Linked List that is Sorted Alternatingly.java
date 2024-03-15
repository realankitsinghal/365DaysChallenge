class Solution {
   public Node sort(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node temp = head;
        Node last = null;
        boolean swapped;
        do{
            swapped = false;
            temp = head;
            while(temp.next != last){
                if(temp.data > temp.next.data){
                     int intermediate=temp.data;
                     temp.data=temp.next.data;
                     temp.next.data=intermediate;
                     swapped = true;
                }
                temp = temp.next;
            }
            last = temp;
        } while(swapped);
        return head;
   }
}