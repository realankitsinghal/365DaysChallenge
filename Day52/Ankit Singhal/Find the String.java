class Solution{
    public static String findString(int n, int k) {
        Set<String> visited = new HashSet<>();
        String startingNode = new String(new char[n - 1]).replace('\0', '0'); 
        List<Integer> path = new ArrayList<>();
        dfs(k, startingNode, visited, path); 
        StringBuilder result = new StringBuilder();
        int totalPaths = (int) Math.pow(k, n);
        for (int i = 0; i < totalPaths; i++) {
            result.append(path.get(i));
        }
        result.append(startingNode); 
        return result.toString(); 
    }
    private static void dfs(int k, String current, Set<String> visited, List<Integer> path) {
        for (int i = 0; i < k; i++) {
            String next = current + (char) ('0' + i);
            if (!visited.contains(next)) {
                visited.add(next); 
                dfs(k, next.substring(1), visited, path); 
                path.add(i); 
            }
        }
    }
}