class Solution {
    public int uniquePathsIII(int[][] a) {
        int count =0;
        int startingx=0;
        int startingy =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0) count++;
            else if(a[i][j]==1){
                startingx =i;
                startingy =j;
            }
        }
        }
    return dfs(a,startingx,startingy,count);
}
    int dfs(int[][] a,int x,int y,int count){
        if(x<0||y<0||x>a.length-1||y>a[0].length-1||a[x][y]==-1){
            return 0;
        }
        
        if(a[x][y]==2) return count==-1?1:0;
        a[x][y] =-1;
        count--;
        
        int totalpaths = dfs(a,x+1,y,count)+
            dfs(a,x,y+1,count)+
            dfs(a,x-1,y,count)+
            dfs(a,x,y-1,count);
        
        a[x][y]=0;
        count++;
        
        return totalpaths;
    }
}

