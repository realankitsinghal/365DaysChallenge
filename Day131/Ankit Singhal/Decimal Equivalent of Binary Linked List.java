class Solution {
    long DecimalValue(Node head) {
        Node itr = head;

        if (itr == null) {
            return 0;
        }

        long sum = 0;
        itr = head;

        while (itr != null) {
            if (itr.data == 1) {
                sum = (sum * 2 + 1) % 1000000007;  
            } else {
                sum = (sum * 2) % 1000000007;  
            }
            itr = itr.next;
        }

        return sum % 1000000007;
    }
}