class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m= grid[0].length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    backtrack(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
    void backtrack(char[][] grid,int i,int j){
        if(i>grid.length-1||j>grid[0].length-1||i<0||j<0||grid[i][j]!='1') return;
        
        grid[i][j] =2;
        backtrack(grid,i-1,j);
        backtrack(grid,i+1,j);
        backtrack(grid,i,j-1);
        backtrack(grid,i,j+1);
        
    }
}