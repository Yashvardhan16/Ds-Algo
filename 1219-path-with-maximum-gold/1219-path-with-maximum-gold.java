class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                     max = Math.max(max, helper(grid,i,j));
                }
            }
        }
        return max;
    }
    int helper(int[][] matrix,int i , int j){
        if(i<0||j<0||i>matrix.length-1||j>matrix[0].length-1||matrix[i][j]==0) { return 0;
            
        }
        int temp = matrix[i][j];
        matrix[i][j] = 0;
      int up=  helper(matrix,i-1,j);
    int down =     helper(matrix,i+1,j);
       int left =  helper(matrix,i,j-1);
        
     int right = helper(matrix,i,j+1);   matrix[i][j] = temp;
    return temp +Math.max(up,Math.max(down,Math.max(left,right)));
    }
}