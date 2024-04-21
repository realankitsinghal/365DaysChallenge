class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int[] edge: edges) {
            if (adjList.get(edge[0]) == null) {
                adjList.put(edge[0], new ArrayList<>());
            }
            if (adjList.get(edge[1]) == null) {
                adjList.put(edge[1], new ArrayList<>());
            } 
            adjList.get(edge[0]).add(edge[1]); // always add
            adjList.get(edge[1]).add(edge[0]); // always add
        }
        return dfs(adjList, visited, destination, source);
    }
    public boolean dfs(Map<Integer, List<Integer>> adjList, boolean[] visited, int destination, int curr) {
        visited[curr] = true;
        if (curr == destination) {
            return true;
        }
        for (int neighbour : adjList.get(curr)) {
            if (!visited[neighbour]) {
                if (dfs(adjList, visited, destination, neighbour)) {
                    return true; 
                }
            }
        }
        return false;
    }    
}