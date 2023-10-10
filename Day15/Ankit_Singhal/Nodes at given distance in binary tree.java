

//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    static ArrayList<Integer> result;

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        result = new ArrayList<>();
        findKDistanceNodes(root, target, k);
        Collections.sort(result); // Sorting the result list
        return result;
    }

    private static int findKDistanceNodes(Node node, int target, int k) {
        if (node == null) {
            return -1;
        }

        if (node.data == target) {
            findKDistanceDown(node, k);
            return 0;
        }

        int leftDistance = findKDistanceNodes(node.left, target, k);

        if (leftDistance != -1) {
            if (leftDistance + 1 == k) {
                result.add(node.data);
            } else {
                findKDistanceDown(node.right, k - leftDistance - 2);
            }
            return leftDistance + 1;
        }

        int rightDistance = findKDistanceNodes(node.right, target, k);

        if (rightDistance != -1) {
            if (rightDistance + 1 == k) {
                result.add(node.data);
            } else {
                findKDistanceDown(node.left, k - rightDistance - 2);
            }
            return rightDistance + 1;
        }

        return -1;
    }

    private static void findKDistanceDown(Node node, int k) {
        if (node == null || k < 0) {
            return;
        }

        if (k == 0) {
            result.add(node.data);
            return;
        }

        findKDistanceDown(node.left, k - 1);
        findKDistanceDown(node.right, k - 1);
    }
};