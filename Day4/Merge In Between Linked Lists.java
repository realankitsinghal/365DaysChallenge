class Solution{
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
                ListNode cur = list1, prevStart = null, postEnd = null;
                while (cur.next != null){
                    if (--a == 0)
                        prevStart = cur;
                    if (b-- == 0){
                        postEnd = cur.next;
                        cur = prevStart;
                        prevStart.next = list2;
                    }
                    cur = cur.next;
                }
                cur.next = postEnd;
                return list1;
    }
}