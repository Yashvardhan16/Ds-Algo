class Solution {
    int count =0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                     helper(grid,i,j);
                    max = Math.max(max,count);
                    count=0;
                }
            }
        }
        return max;
    }
    int helper(int[][] grid,int i,int j){
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]!=1) return 0 ;
        
        grid[i][j] =2;
      count++;
        helper(grid,i-1,j);
         helper(grid,i+1,j);
         helper(grid,i,j-1);
         helper(grid,i,j+1);
        return count;
    }
}