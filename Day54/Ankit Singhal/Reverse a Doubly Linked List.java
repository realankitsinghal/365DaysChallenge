public static Node reverseDLL(Node  head)
{
        head.prev = head.next;
        head.next = null;
        while(head.prev != null) {
              head.prev.prev = head.prev.next;
              head.prev.next = head;
              head = head.prev;
        }
        return head;
}