class Solution
{

	public static void inorder(Node root, List<Integer> in)
    {
        if(root != null) 
        {
            inorder(root.left, in);
            in.add(root.data);
            inorder(root.right, in);
        }
    }

    public static int countPairs(Node root1, Node root2, int x)
    {
        List<Integer> in1 = new ArrayList<>(), in2 = new ArrayList<>();
        inorder(root1, in1);
        inorder(root2, in2);
        
        int count = 0, i = 0, j = in2.size() - 1;
        
        while(i < in1.size() && j >= 0) 
        {
            int sum = in1.get(i) + in2.get(j);
            if(sum == x) 
            {
                count++;
                i++; j--;
            }
            else if(sum > x)
                j--;
            else
                i++;
        }
        
        return count;
    }
}