class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<n;i++){
            helper(mat,i,0);
        }
        
        for(int i=m-1;i>=0;i--){
            helper(mat,0,i);
        }
        return mat;
    }
    void helper(int[][] matrix,int row,int col){
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=row , j=col;i<matrix.length && j<matrix[0].length;i++,j++){
            pq.add(matrix[i][j]);
        }
        
        while(pq.size()>0){
            matrix[row++][col++] = pq.poll();
        }
    }
}