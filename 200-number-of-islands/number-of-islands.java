class Solution {
    public void dfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1; // Mark the current cell as visited
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});

        // Directions: up, down, left, right
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};

        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currRow = curr[0];
            int currCol = curr[1];

            for (int i = 0; i < 4; i++) {
                int nRow = currRow + delRow[i];
                int nCol = currCol + delCol[i];

                // Check bounds and if it's land and not visited
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m &&
                    grid[nRow][nCol] == '1' && vis[nRow][nCol] == 0) {
                    vis[nRow][nCol] = 1;
                    q.offer(new int[]{nRow, nCol});
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1' && visited[i][j] == 0){
                    count++;
                    dfs(i, j, visited, grid);
                }
            }
        }
        return count;
    }
}