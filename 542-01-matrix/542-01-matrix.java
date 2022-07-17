class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int max = 100000;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) continue;
                int top = i-1>=0?mat[i-1][j]:max;
                int left = j-1>=0?mat[i][j-1]:max;
                mat[i][j] = Math.min(top,left)+1;
            }
        }
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                    if(mat[i][j]==0) continue;
                int bottom = i+1<n?mat[i+1][j]:max;
                int right = j+1<m?mat[i][j+1]:max;
                mat[i][j] = Math.min(mat[i][j],Math.min(bottom,right)+1);
            }
        }
        return mat;
    }
}