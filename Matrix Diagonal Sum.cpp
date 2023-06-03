class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int s = 0 ;
        int n =mat.size();
        for(int i = 0 ; i <n  ; i++)
        {
            s = s + mat[i][i] + mat[i][n-i-1];
        }
        if(n%2!=0)
        {
            s = s -  mat[n/2][n/2];
        }
        return s;
    }
};