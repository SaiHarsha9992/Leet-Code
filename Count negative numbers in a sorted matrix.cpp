class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int n=grid.size();
        int m= grid[0].size();
         int res=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(grid[i][j]<0){
                     res+=m-j;
                     break;
                 }
             }
         }
         return res;
    }
};