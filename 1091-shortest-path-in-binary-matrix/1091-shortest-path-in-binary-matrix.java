class Solution {
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int[][] dir = new int[][]{{1,1},{1,0},{-1,-1},{-1,0},{0,1},{0,-1},{-1,1},{1,-1}};
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{0,0,1});
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            int[] location = q.poll();
            int r = location[0];
            int c = location[1];
            int distance = location[2];
            if(r==n-1 && c==m-1) return distance;
            for(int[] d: dir){
                int r1 = r +d[0];
                int c1 = c+d[1];
                if(r1<n && c1<m && r1>=0 && c1>=0 && grid[r1][c1]==0){
                    q.offer(new int[]{r1,c1,distance+1});
                    grid[r1][c1] =1;
                }
            }
        }
        return -1;
    }
}