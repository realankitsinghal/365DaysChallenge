private static int findCountLessThan(ArrayList<Integer> mem, int x) {
    int l = 0, h = mem.size()-1;

    while(l<=h) {
        int mid = (l+h)/2;

        if(mem.get(mid) > x) {
            h = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    return l;
}

static int ans = 0;

private static void rec(Node root, ArrayList<Integer> mem) {
    if(root==null) {
        return;
    }

    rec(root.left, mem);

    int count = findCountLessThan(mem, root.data);

    ans += (mem.size() - count);

    mem.add(count, root.data);

    rec(root.right, mem);

}

public static int pairsViolatingBST(int n, Node root) {

    ArrayList<Integer> mem = new ArrayList<>();

    ans = 0;

    rec(root, mem);

    return ans;

    // code here
}