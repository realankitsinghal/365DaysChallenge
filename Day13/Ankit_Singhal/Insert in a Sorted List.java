class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        if(head1==null){
            head1.data = key;
            return head1;
        }
        Node temp = head1;
        Node valx = new Node(key);
        Node pre = null;
        while(temp!=null){
            if(temp.data >= key){
                if(pre!=null){
                    pre.next = valx;
                    valx.next = temp;
                    break;
                }else{
                    valx.next = temp;
                    head1 = valx;
                    break;
                }
            }
            pre = temp;
            temp = temp.next;
        }
        if(temp==null){
            pre.next = valx;
            valx.next = null;
        }
        return head1;
    }
}