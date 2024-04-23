class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; ++i) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (adj[i].size() == 1) leaves.add(i);
        }
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = adj[i].remove(0);
                adj[j].remove(Integer.valueOf(i));
                if (adj[j].size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}