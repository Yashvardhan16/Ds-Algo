class Solution {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int len =0;
        int[][] mem = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int path =  dfs(matrix,n,m,i,j,mem);
                    len = Math.max(len,path);
            }
        }
        return len;
    }
    int dfs(int[][] matrix,int n,int m,int i,int j,int[][] mem ){
        if(mem[i][j]>0) return mem[i][j];
        int max =0;
        for(int[] d:dir){
            int x = i+d[0];
            int y = j+d[1];
            if(x>=0 && y>=0 && x<n && y<m && matrix[x][y]>matrix[i][j]){
                max = Math.max(max,dfs(matrix,n,m,x,y,mem));
            }
        }
        mem[i][j] = max+1;
        return max+1;
    }
}