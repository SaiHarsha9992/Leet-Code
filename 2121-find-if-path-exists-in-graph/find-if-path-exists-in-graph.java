class Solution {
    public boolean dfs(List<List<Integer>> adjList, boolean[] visited, int curr, int target) {
        if (curr == target) return true;
        visited[curr] = true;
        for (int neighbour : adjList.get(curr)){
            if (!visited[neighbour]){
                if(dfs(adjList, visited, neighbour, target)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u); 
        }
        boolean[] visited = new boolean[n + 1];
        return dfs(adjList, visited, source, destination);
    }
}