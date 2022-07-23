class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            helper(mat,i,0);
        }
        for(int i=mat[0].length-1;i>=0;i--){
            helper(mat,0,i);
        }
        return mat;
    }
    void helper(int[][] mat,int r,int c){
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=r, j=c; i<mat.length && j<mat[0].length;i++,j++){
            pq.add(mat[i][j]);
        }
        
        while(pq.size()>0){
            mat[r++][c++] = pq.poll();
        }
    }
}