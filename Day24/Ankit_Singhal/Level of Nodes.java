class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        int[] level = new int[V];
        Arrays.fill(level, -1);

        // Perform BFS starting from node 0.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        level[0] = 0; // Node 0 is at level 0.

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            // Iterate through the adjacent nodes of the current node.
            for (int neighbor : adj.get(currentNode)) {
                // If the neighbor node has not been visited yet, mark its level and add it to the queue.
                if (level[neighbor] == -1) {
                    level[neighbor] = level[currentNode] + 1;
                    queue.add(neighbor);
                }
            }
        }

        // Check if the target node X exists and return its level.
        if (X >= 0 && X < V) {
            return level[X];
        }

        // If X doesn't exist in the graph, return -1.
        return -1;
    }
}