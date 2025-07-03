class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int visit[]){
        visit[node] = 1;
        for( Integer it: adjList.get(node)) {
            if(visit[it] == 0){
                dfs(it, adjList, visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int visit[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            if(visit[i] == 0){
                count++;
                dfs(i, adjList, visit);
            }
        }
        return count;
    }
}