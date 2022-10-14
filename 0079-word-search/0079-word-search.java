class Solution {
      boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        
      visited = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0) && helper(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] board,int i,int j,int start,String word){
        if(start==word.length()) return true;
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!=word.charAt(start)||visited[i][j]) return false;
        
        visited[i][j] = true;
        if(helper(board,i+1,j,start+1,word)||helper(board,i-1,j,start+1,word)||helper(board,i,j+1,start+1,word)||helper(board,i,j-1,start+1,word)) return true;
        visited[i][j] =false;
        return false;
    }
}