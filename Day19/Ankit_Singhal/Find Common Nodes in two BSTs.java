
class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        ArrayList<Integer> commonNodes = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        while (root1 != null || root2 != null || !stack1.isEmpty() || !stack2.isEmpty()) {
            while (root1 != null) {
                stack1.push(root1);
                root1 = root1.left;
            }

            while (root2 != null) {
                stack2.push(root2);
                root2 = root2.left;
            }

            if (stack1.isEmpty() || stack2.isEmpty()) {
                break;
            }

            Node top1 = stack1.peek();
            Node top2 = stack2.peek();

            if (top1.data == top2.data) {
                commonNodes.add(top1.data);
                root1 = top1.right;
                root2 = top2.right;
                stack1.pop();
                stack2.pop();
            } else if (top1.data < top2.data) {
                root1 = top1.right;
                stack1.pop();
            } else {
                root2 = top2.right;
                stack2.pop();
            }
        }

        return commonNodes;
    }
}