class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        st2.push(x);
        Stack<Integer> st1 = new Stack<>();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return st1;
    }
}