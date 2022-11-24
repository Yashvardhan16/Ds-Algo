class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]== word.charAt(0) && helper(board,word,i,j,visited,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] board,String word,int i,int j, boolean[][] visited,int start){
        if(start==word.length()) return true;
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!=word.charAt(start)||visited[i][j]) return false;
        
        visited[i][j] = true;
       if(helper(board,word,i+1,j,visited,start+1)||
        helper(board,word,i-1,j,visited,start+1)||
        helper(board,word,i,j+1,visited,start+1)||
        helper(board,word,i,j-1,visited,start+1)) return true;
        visited[i][j] = false;
        return false;
    }
}