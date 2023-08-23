class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int coloumns = matrix[0].length;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < coloumns ; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}